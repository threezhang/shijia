package com.shijia.controller;

import com.shijia.entity.Twitter;
import com.shijia.service.TwitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author by jiuru on 16/5/4.
 */

@Controller
public class TwitterController {

    @Autowired
    private TwitterService twitterService;


    @RequestMapping(value = "/")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        List<Twitter> list = twitterService.getAll();
        modelAndView.setViewName("index");
        modelAndView.addObject("title", "测试");
        return modelAndView;
    }


    @RequestMapping(value = "/index")
    public String index(@ModelAttribute("model") ModelMap model){
        model.addAttribute("user", "jiuru");
        return "index";
    }

}
