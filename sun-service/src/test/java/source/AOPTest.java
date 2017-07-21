package source;

import common.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import sun.aop.Shopping;

/**
 * Created by zhangshaolin on 2017/7/21.
 */
public class AOPTest extends BaseTest {
    @Autowired
    private Shopping shopping;

    @Test
    public void test() throws Exception {
        shopping.buyAnything("33");
    }
}
