package com.charlene.controller;


import com.charlene.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/test")
public class DemoController{

    @RequestMapping("/intro")
    public String intro(){
        return "test";
    }
    @RequestMapping(value="/getUser", method=RequestMethod.GET)
    public String getUser(@RequestBody User angularUser){
        System.out.println("ID" + angularUser.getId());
        System.out.println("name" + angularUser.getName());
        System.out.println("age" + angularUser.getAge());
        return null;
    }
}
