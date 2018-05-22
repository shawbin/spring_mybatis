package com.doushabao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StaticPageController {

    @RequestMapping(value = "/order/orderDetail", method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView orderDetail(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/order/order_detail");
        return mav;
    }
}
