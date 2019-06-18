package edu.mum.cs5.airTicketbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@ComponentScan
public class AboutUsController {
    @Autowired

    @GetMapping(value = "/c2")
    public  String displayCommonHomepage(){
        return "admin/index123";
    }
    @GetMapping(value = "/c")
    public  String displayCustomerHomepage(){
        return "customer/index101";
    }

    @GetMapping(value = "/")
    public  String displayHomepage(){
        return "admin/index123";
    }
//    @GetMapping(value = "/newdate")
//    public  String myDatinfo(){
//        return "admin/myDate";
//    }


//    @PostMapping(value = "/addnewdate")
//    public  String addmyDatinfo(){
//
//        return "admin/MyDate";
//    }


}
