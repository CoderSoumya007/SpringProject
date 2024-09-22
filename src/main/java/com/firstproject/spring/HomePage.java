package com.firstproject.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public  class HomePage {
    @RequestMapping("/")
       public String greet(){
        return "Hii, Soumya ranjan panda";
    }
}
