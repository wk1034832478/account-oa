package home.hyywk.top.imply;

import home.hyywk.top.api.AccountDomainApi;
import home.hyywk.top.entity.AccountDomain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author 王凯
 * @Created 2019/7/19 0019-0:04
 */
public class AccountDomainApiImply implements AccountDomainApi {

    private Logger logger = LoggerFactory.getLogger(AccountDomainApiImply.class);

    @Override
    public AccountDomain selectById(Long id) {
        logger.debug("根据id:{}获取Account对象", id);
        return new AccountDomain();
    }
}
