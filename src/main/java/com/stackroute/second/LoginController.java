package com.stackroute.second;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {

    @RequestMapping(value = "/login")
    public ModelAndView login(HttpServletRequest req)
    {

        System.out.println(req.getParameter("name"));
        ModelAndView mv = new ModelAndView("login");
        mv.addObject("name", req.getParameter("name"));
        return mv;
    }

}