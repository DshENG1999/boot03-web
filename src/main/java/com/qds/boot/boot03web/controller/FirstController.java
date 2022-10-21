package com.qds.boot.boot03web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DshENG22
 * @create 2022-10-18-0:21
 */
@RestController
public class FirstController {
    @RequestMapping("/obito.png")
    public String first(){
        return "aaa";
    }
    @RequestMapping(value = "/user",method = RequestMethod.DELETE)
    public String deleteUser(){
        return "DELETE";
    }
}
