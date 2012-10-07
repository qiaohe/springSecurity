package com.mobiledaily.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * User: johnson
 * Date: 10/7/12
 * Time: 3:01 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("message", "hello world");
        return "hello";
    }

}
