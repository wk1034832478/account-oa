package home.hyywk.top.imply;

import home.hyywk.top.api.AccountDoApi;
import home.hyywk.top.entity.AccountDo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @Author 王凯
 * @Created 2019/7/19 0019-0:04
 */
@Service
public class AccountDoApiImply implements AccountDoApi {

    private Logger logger = LoggerFactory.getLogger(AccountDoApiImply.class);

    @Override
    public AccountDo selectById(Long id) {
        logger.debug("根据id:{}获取Account对象", id);
        return new AccountDo();
    }
}
