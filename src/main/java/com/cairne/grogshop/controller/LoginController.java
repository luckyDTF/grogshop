package com.cairne.grogshop.controller;

import com.cairne.grogshop.domain.UserDTO;
import com.cairne.grogshop.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName TestController
 * @Description TODD
 * @Author ASUS
 * @Date 2019/10/13 15:59
 **/
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = {"/", "/index"})
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/Login/tologin.do")
    public String toLoginPage() {
        return "login/login";
    }

    @RequestMapping(value = "/Login/tomain.do")
    public String login(@RequestParam("userName") String username, @RequestParam("password") String password) {
        try {
            UserDTO userDTO = new UserDTO();
            userDTO.setUsername(username);
            userDTO.setPassword(password);
            Boolean login = loginService.login(userDTO);
            if (login) {
                return "main/main";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "login/login";
    }

}
