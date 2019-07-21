package home.hyywk.top.accountdubbo.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 王凯
 * @created 2019/7/20 0020-12:59
 */
public class Test {
    private Logger logger = LoggerFactory.getLogger(Test.class);
    @org.junit.Test
    public void contextLoads() {
        logger.debug("测试");
        logger.info("测试");
        logger.warn("测试");
        logger.trace("测试");
    }
}
