package home.hyywk.top.imply;

import home.hyywk.top.api.UserInfoDoApi;
import home.hyywk.top.entity.UserInfoDo;
import org.apache.tomcat.util.http.fileupload.IOUtils;

/**
 * @author 王凯
 * @created 2019/7/20 0020-16:56
 */
public class UserInfoDoImpl implements UserInfoDoApi {

    @Override
    public UserInfoDo selectByUsernameAndPassword(String username, String passwsord) {
        return null;
    }

    @Override
    public Integer updatePassword(Long id, String newPassword) {
        return null;
    }
}
