package home.hyywk.top.api;

import home.hyywk.top.entity.AccountDo;

/**
 * @Author 王凯
 * @Created 2019/7/19 0019-0:01
 */
public interface AccountDomainApi {
    /**
     *
     * @param id
     * @return
     */
    AccountDo selectById(Long id);
}
