package cn.liuyiyou.spring.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeComtroller {


    @RequestMapping("/")
    public String hello() {
        return "success";
    }

}
