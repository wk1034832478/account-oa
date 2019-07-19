package home.hyywk.top;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;

/**
 * @Author 王凯
 * @Created 2019/7/19 0019-22:27
 */
@SpringBootApplication
public class AccountMyDubboProviderApplication {
    public static void main(String[] args) throws Exception{
         SpringApplication.run(AccountMyDubboProviderApplication.class, args);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }

}
