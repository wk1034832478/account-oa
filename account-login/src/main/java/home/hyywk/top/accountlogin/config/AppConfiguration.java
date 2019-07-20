package home.hyywk.top.accountlogin.config;

import home.hyywk.top.api.AccountDoApi;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.context.annotation.Configuration;

/**
 * @Author 王凯
 * @Created 2019/7/19 0019-23:35
 */
@Configuration
public class AppConfiguration {

    private AccountDoApi accountDomainApi;

    public AppConfiguration() {}

    @Reference
    public void setAccountDomainApi(AccountDoApi accountDomainApi) {
        System.out.println( accountDomainApi );
        this.accountDomainApi = accountDomainApi;
    }
}
