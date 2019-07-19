package home.hyywk.top.api;

import home.hyywk.top.entity.AccountDomain;

/**
 * @Author 王凯
 * @Created 2019/7/19 0019-0:01
 */
public interface AccountDomainApi {

    /**
     * 通过id获得account
     * @param id account id
     * @return
     */
    AccountDomain selectById(Long id);

}
