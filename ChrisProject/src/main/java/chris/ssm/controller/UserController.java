package chris.ssm.controller;

import chris.ssm.model.User;
import chris.ssm.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Zhangxq on 2016/7/15.
 */

@Controller
public class UserController {

    private Logger log = Logger.getLogger(UserController.class);
    @Resource
    private UserService userService;

    @RequestMapping("/showUser")
    public String showUser(HttpServletRequest request, Model model){
        System.out.println("show user");

        log.info("heiehi");
        List<User> userList = userService.getAllUser();
        model.addAttribute("userList",userList);
        model.addAttribute("nihao","nihao");

        return "showUser";
    }

    @RequestMapping("/index")
    public String showIndex(HttpServletRequest request, Model model){
        System.out.println("heihei");
        log.info("你好");
        return "login";
    }
}
