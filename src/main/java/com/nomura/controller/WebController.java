package com.nomura.controller;

/**
 * Created by Darshika on 02-01-2017.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=true) String name,
           @RequestParam(value="sub1", required=true) String sub1,
           @RequestParam(value="sub2", required=true) String sub2,
     Model model) {

        Double percentageOfStudent = (Integer.parseInt(sub1) + Integer.parseInt(sub2))/2.0;


        model.addAttribute("name", name);
        model.addAttribute("percentage",percentageOfStudent);
        return "greeting";
    }

}
