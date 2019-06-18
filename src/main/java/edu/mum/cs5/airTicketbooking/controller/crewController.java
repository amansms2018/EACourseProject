package edu.mum.cs5.airTicketbooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class crewController {

    @GetMapping(value = "/crew")
    public  String crewPage(){
        return   "admin/crew";
    }
}
