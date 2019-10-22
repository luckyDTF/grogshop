package com.gx.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName Index
 * @Description TODD
 * @Author ASUS
 * @Date 2019/10/22 21:27
 **/
@Controller
public class Index {

    @RequestMapping(value = {"/","/index"})
    public String index(){
        return "index";
    }
}
