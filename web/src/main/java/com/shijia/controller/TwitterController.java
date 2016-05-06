package com.shijia.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
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
        modelAndView.setViewName("index_new");
        modelAndView.addObject("list", list);
        return modelAndView;
    }


    @RequestMapping(value = "/index")
    public String index(@ModelAttribute("model") ModelMap model){
        model.addAttribute("user", "jiuru");
        return "index";
    }

    @RequestMapping(value = "/json")
    public String json(){
        return "index_json";
    }

    @RequestMapping(value = {"/index/json"}, method = RequestMethod.GET, produces = {"application/json;charset=utf-8"})
    public String indexJson() {
        List<Twitter> list = twitterService.getAll();
        JSONObject response = new JSONObject();
        JSONObject status = new JSONObject();
        response.put("result", JSONObject.toJSONString(list));
        status.put("code", 1001);
        status.put("msg", "OK");
        response.put("status", status);
        return JSONObject.toJSONString(response, SerializerFeature.BrowserCompatible, SerializerFeature.BrowserCompatible);
    }


}
