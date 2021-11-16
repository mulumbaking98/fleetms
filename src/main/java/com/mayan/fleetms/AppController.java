package com.mayan.fleetms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {



    @GetMapping("/home")
    public String home(){
        return "index";
    }

    @GetMapping("/widgets")
    public String widget(){return "widgets";}
}
