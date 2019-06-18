package edu.mum.cs5.airTicketbooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlaneController {
    @GetMapping(value = "/plane")
    public  String planePage(){
        return "admin/plane";
    }

}
