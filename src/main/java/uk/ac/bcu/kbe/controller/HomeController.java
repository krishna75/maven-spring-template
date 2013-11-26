package uk.ac.bcu.kbe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created By: Krishna Sapkota
 * Date: 25/11/13
 * Time: 18:33
 * A part of BioenNW project in KBE lab Birmingham City University
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String welcome(ModelMap model) {
        model.addAttribute("message", "Welcome To Spring Framework ");
        return "index";
    }
}
