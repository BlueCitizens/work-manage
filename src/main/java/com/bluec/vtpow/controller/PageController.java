package com.bluec.vtpow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.annotation.MultipartConfig;

@MultipartConfig
@Controller
public class PageController {


    @GetMapping({"index", "/"})
    public String index() {
        return "index";
    }

    @GetMapping("stu_list")
    public String getStuList() {
        return "system/stulist";
    }

    @GetMapping("work_list")
    public String getWorkList() {
        return "system/worklist";
    }

    @GetMapping("work_business")
    public String getWork() {
        return "business/worklist";
    }

    @GetMapping("login")
    public String ge() {
        return "login";
    }

    @GetMapping("404")
    public String get404() {
        return "404";
    }

    @GetMapping("demo")
    public String getDemo() {
        return "business/demo";
    }

    @GetMapping("upload_history")
    public String getHistory() {
        return "business/history";
    }

    @GetMapping("profile")
    public String getProfile() {
        return "business/profile";
    }

    @GetMapping("conf")
    public String getConf() {
        return "business/conf";
    }

    @GetMapping("sys_conf")
    public String getSysConf() {
        return "system/sysconf";
    }


}