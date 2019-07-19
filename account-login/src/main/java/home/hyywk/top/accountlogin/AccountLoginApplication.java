package home.hyywk.top.accountlogin;

import home.hyywk.top.api.AccountDomainApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class AccountLoginApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountLoginApplication.class, args);


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        AccountDomainApi accountDomainApi = (AccountDomainApi) context.getBean("accountDomainApi");
        System.out.println( accountDomainApi.selectById(1l) );
    }

}