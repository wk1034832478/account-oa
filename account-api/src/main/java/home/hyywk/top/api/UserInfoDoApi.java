package home.hyywk.top.api;

import home.hyywk.top.entity.UserInfoDo;

import java.io.Serializable;

/**
 * @author 王凯
 * @created 2019/7/20 0020-16:51
 */
public interface UserInfoDoApi {

    /***
     *  根据用户名和密码进行查询登录用户信息，实现方法至少要用MD5对密码进行加密
     * @param username 用户名
     * @param passwsord 密码
     * @return 用户信息
     */
    UserInfoDo selectByUsernameAndPassword(String username, String passwsord);

    /**
     * 根据id修改用户的用户名
     * @param id 用户id
     * @param newPassword 新的密码
     * @return 成功返回1 否则返回0
     */
    Integer updatePassword(Long id, String newPassword);

}
