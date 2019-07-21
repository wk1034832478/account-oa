package home.hyywk.top;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
