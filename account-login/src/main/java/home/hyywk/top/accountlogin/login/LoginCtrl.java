package home.hyywk.top.accountlogin.login;

import home.hyywk.top.api.AccountDoApi;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author 王凯
 * @Created 2019/7/20 0020-1:33
 */
@RestController
@RequestMapping("login")
public class LoginCtrl {

    @Reference
    private AccountDoApi accountDoApi;

    /*@GetMapping("login")
    public String login() {
        return accountDoApi.selectById(11l).toString();
    }*/

    @GetMapping("ok")
    public String getOk() {
        return "ok";
    }

    @GetMapping("enter")
    public ModelAndView enter() {
        return new ModelAndView("index.html");
    }
}
