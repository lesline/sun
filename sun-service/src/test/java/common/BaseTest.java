package common;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zhangshaolin on 2017/7/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class BaseTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("---------------------------before------------------");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("---------------------------end------------------");

    }
}
