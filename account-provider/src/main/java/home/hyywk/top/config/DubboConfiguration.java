package home.hyywk.top.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @Author 王凯
 * @Created 2019/7/19 0019-0:16
 */
@Configuration
@ImportResource("applicationContext.xml")
public class DubboConfiguration {
    public DubboConfiguration() {
        System.out.println("....");
    }
}
