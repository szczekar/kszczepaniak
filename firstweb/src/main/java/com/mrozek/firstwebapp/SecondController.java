package com.mrozek.firstwebapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@Controller
public class SecondController {
    @Autowired
    @Qualifier("multiMultiLottoService")
    private LottoService lottoService;

    @RequestMapping(value = "/multi", method = RequestMethod.GET)
    @ResponseBody
    public String helloWithDate() {
        return "Lotto numbers for today: " + lottoService.generateNumbers();
    }

}
