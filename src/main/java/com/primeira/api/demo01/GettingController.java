package com.primeira.api.demo01;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class GettingController {

    @GetMapping(value = "/{name}")
    @ResponseStatus(HttpStatus.OK)
    public String getMethodName(@PathVariable String name) {
        return "Hello " + name;
    }

}
