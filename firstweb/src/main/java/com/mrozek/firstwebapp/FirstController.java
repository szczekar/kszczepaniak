package com.mrozek.firstwebapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@Controller
public class FirstController {

    @Autowired
    @Qualifier("miniLottoService")
    private LottoService lottoService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String helloWorld() {
        return "Hello world";
    }

    @RequestMapping(value = "/today", method = RequestMethod.GET)
    @ResponseBody
    public String helloWithDate() {
        return lottoService.generateWelcome()+ "<br />" + "Hello, today is " + "<br />" + " " + LocalDateTime.now()+"<br />"+ " Lotto numbers for today: " + lottoService.generateNumbers();
    }
}
