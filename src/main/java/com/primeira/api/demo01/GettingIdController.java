package com.primeira.api.demo01;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

public class GettingIdController {
    @GetMapping(value = "/name/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String getMethodName(@PathVariable int id) {
        return "Hello " + id;
    }
}
