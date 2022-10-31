package com.primeira.api.demo01;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostingController {

    @PostMapping(value = "/{name}")
    @ResponseStatus(HttpStatus.OK)
    public String postMethodName(@PathVariable String name) {
        return "Hello " + name;
    }

}
