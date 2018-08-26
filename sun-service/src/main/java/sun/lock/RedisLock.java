package sun.lock;

import java.util.Collections;
import java.util.List;

/**
 * 〈通过redis尝试获取分布式锁〉
 *
 * @author zhangshaolin
 * @create 2018/2/8
 * @since 1.0.0
 */
public class RedisLock {
    /**
     * 正确示例:获取分布式锁
     *
     * @param jedis      Redis客户端
     * @param lockKey    锁
     * @param requestId  请求标识
     * @param expireTime 超期时间
     * @return 是否获取成功
     */
    public static boolean tryGetDistributedLock(Jedis jedis, String lockKey, String requestId, int expireTime) {
        String result = jedis.set(lockKey, requestId, "NX", "PX", expireTime);
        if ("OK".equals(result)) {
            return true;
        }
        return false;
    }

    /**
     * 错误示例
     * 原因：两部操作不具有原子性
     *
     * @param jedis      Redis客户端
     * @param lockKey    锁
     * @param requestId  请求标识
     * @param expireTime 超期时间
     * @return 是否获取成功
     */
    public static boolean wrongGetLock1(Jedis jedis, String lockKey, String requestId, int expireTime) {
        Long result = jedis.setnx(lockKey, requestId);
        if (result == 1) {
            // 若在这里程序突然崩溃，则无法设置过期时间，将发生死锁
            jedis.expire(lockKey, expireTime);
            return true;
        }
        return false;
    }

    /**
     * 正确示例：释放分布式锁
     *
     * @param jedis     Redis客户端
     * @param lockKey   锁
     * @param requestId 请求标识
     * @return 是否释放成功
     */

    public static boolean releaseDistributedLock(Jedis jedis, String lockKey, String requestId) {
        String script = "if redis.call('get', KEYS[1]) == ARGV[1] then return redis.call('del', KEYS[1]) else return 0 end";
        Object result = jedis.eval(script, Collections.singletonList(lockKey), Collections.singletonList(requestId));
        Long RELEASE_SUCCESS = 1L;
        if (RELEASE_SUCCESS.equals(result)) {
            return true;
        }
        return false;
    }

    /**
     * 错误示例：释放分布式锁时两步操作，不是原子操作
     *
     * @param jedis
     * @param lockKey
     * @param requestId
     * @return
     */
    public static boolean wrongReleaseLock2(Jedis jedis, String lockKey, String requestId) {
        // 判断加锁与解锁是不是同一个客户端
        if (requestId.equals(jedis.get(lockKey))) {
            // 若在此时，这把锁突然不是这个客户端的，则会误解锁
            jedis.del(lockKey);
            return true;
        } else {
            return false;
        }

    }

    //为了便于演示，Jedis在此声明，实际Jedis的有开源的代码实现
    private static class Jedis {
        public Long setnx(String lockKey, String requestId
        ) {
            return null;
        }

        public Object eval(String script, List<String> strings, List<String> strings1) {
            return null;
        }

        public void expire(String lockKey, int expireTime) {
        }

        public String set(String lockKey, String requestId, String nx, String px, int expireTime) {
            return null;
        }

        public String get(String lockKey) {
            return null;
        }

        public void del(String lockKey) {
        }
    }
}


