package com.last.project.Controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Cot {
    @RequestMapping("/home")
    public String home(){

        return "home";
    }
    @RequestMapping("/boot")
    public String boot(){

        return "S";
    }

}
