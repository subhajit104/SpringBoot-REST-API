package com.codingWithSubhajit.RestAPi.RestApi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePage {

    @RequestMapping("/")
    public String homeIndex()
    {
        return "<p1>You deserve two beer!</p1>" ;
    }
}
