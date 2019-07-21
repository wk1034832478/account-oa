package home.hyywk.top.accountlogin.login;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.websocket.server.PathParam;

/**
 * @author 王凯
 * @created 2019/7/21 0021-08:23
 */
@RestController
@RequestMapping("error")
public class ErrorCtrl  implements ErrorController {

    @GetMapping("{code}")
    public ModelAndView enter(@PathVariable("code") String code) {
        return new ModelAndView("/" + code + ".html");
    }

    @Override
    public String getErrorPath() {
        return "/404.html";
    }

    @RequestMapping
    public ModelAndView error() {
        return new ModelAndView(getErrorPath());
    }

    /**
     * 统一异常处理
     *
     * @param exception
     *            exception
     * @return
     */
    @ExceptionHandler({ RuntimeException.class })
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView processException(RuntimeException exception) {
        ModelAndView m = new ModelAndView();
        m.addObject("roncooException", exception.getMessage());
        m.setViewName("error/500");
        return m;
    }

    /**
     * 统一异常处理
     *
     * @param exception
     *            exception
     * @return
     */
    @ExceptionHandler({ Exception.class })
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView processException(Exception exception) {
        ModelAndView m = new ModelAndView();
        m.addObject("roncooException", exception.getMessage());
        m.setViewName("error/500");
        return m;
    }

}
