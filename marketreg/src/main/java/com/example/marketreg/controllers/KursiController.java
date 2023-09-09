package com.example.marketreg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KursiController {
    @GetMapping("/kursi")
    public String kursiObj(){
        return "kursi";
    }
}