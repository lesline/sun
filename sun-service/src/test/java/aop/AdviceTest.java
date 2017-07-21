package aop;

import common.BaseTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sun.aop.advice.Shopping;

/**
 * Created by zhangshaolin on 2017/7/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:advice.xml"})
public class AdviceTest extends BaseTest {
    @Autowired
    private Shopping shopping;

    @Test
    public void test() throws Exception {
        shopping.buyAnything("33");
    }
}
