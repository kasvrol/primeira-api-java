package com.primeira.api.demo01;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class GettingController {

    @GetMapping(value = "/")
    @ResponseStatus(HttpStatus.OK)
    public String getMethodName() {
        return "Hello World ; )";
    }

}
