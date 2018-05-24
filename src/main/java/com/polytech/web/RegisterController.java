package com.polytech.web;

import com.polytech.service.User;
import com.polytech.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;

@Controller
public class RegisterController {

    private UserService userService ;

    public RegisterController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value="/register",method = RequestMethod.GET)
    public String registerPage(){
        System.out.println("register get");
        return "/register";
    }

    @RequestMapping(value="/register", method = RequestMethod.POST)
    public String register(User user){
        userService.addUser(user);
        System.out.println("register controller");
        System.out.println(user);
        return "register";
    }

    @RequestMapping(value="/login",method = RequestMethod.GET)
    public String loginPage(){
        return "/login";
    }
}
