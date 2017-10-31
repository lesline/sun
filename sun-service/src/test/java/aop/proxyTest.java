package aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sun.aop.proxy.UserService;

/**
 * Created by zhangshaolin on 2017/7/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:proxy.xml"})
public class proxyTest  {
    @Autowired
    private UserService userService;

    @Test
    public void test() throws Exception {
        userService.updateUser();
    }
}
