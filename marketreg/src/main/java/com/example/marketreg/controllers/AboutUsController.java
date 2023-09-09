package com.example.marketreg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutUsController {
    @GetMapping("/aboutus")
    public String aboutusObj(){
        return "aboutus";
    }
}
