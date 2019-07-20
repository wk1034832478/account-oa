package home.hyywk.top.accountdubbo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.Executor;

/*@RunWith(SpringRunner.class)
@SpringBootTest*/
public class AccountDubboApplicationTests {
    private Logger logger = LoggerFactory.getLogger(AccountDubboApplicationTests.class);
    @Test
    public void contextLoads() {
        logger.debug("测试");
        logger.info("测试");
        logger.warn("测试");
    }

}
