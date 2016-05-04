package com.shijia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author by jiuru on 16/5/4.
 */

@Controller
public class TwitterController {


    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }


    @RequestMapping(value = "/index")
    public String index(@ModelAttribute("model") ModelMap model){
        model.addAttribute("user", "jiuru");
        return "index";
    }

}
