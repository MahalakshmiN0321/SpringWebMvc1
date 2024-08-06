package com.maha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ExampleController {

    @GetMapping("/get")
    public String Form(){
        return "exampleForm";
    }

    @PostMapping("/post")
    public String submitForm(@RequestParam("message") String message, Model model ){
            model.addAttribute("message", message);
            return "result";
    }

}
