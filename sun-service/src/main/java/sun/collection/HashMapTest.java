package sun.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangshaolin on 2018/1/11.
 */
public class HashMapTest {

    public static void main(String[] args) {
        Map map=new HashMap();
        map.put("a","1");
        for (int i=0; i<50;i++){
            map.put("b"+i,i);
        }
        map.put("a","2");
        map.put("b","3");
        map.put("c","3");
        System.out.println(map);
    }
}
