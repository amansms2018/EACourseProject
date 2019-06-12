package edu.mum.cs5.airTicketbooking.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@ComponentScan
public class AboutUsController {
    @GetMapping(value = "/")
    public  String displayHomepage(){
        return "admin/index";
    }

}
