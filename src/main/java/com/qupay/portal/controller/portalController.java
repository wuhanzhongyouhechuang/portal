package com.qupay.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName portalController
 * @Author Liuq
 * @Description todo
 * @Date 2018/12/6 13:56
 **/

@Controller
public class portalController {
    @RequestMapping("/")
    public String portal(){
        return "index";
    }

    @RequestMapping("/index.html")
    public String index(){
        return "index";
    }

    @RequestMapping("/pages/application.html")
    public String application(){
        return "pages/application";
    }
}
