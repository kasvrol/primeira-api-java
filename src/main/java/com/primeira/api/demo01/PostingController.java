package com.primeira.api.demo01;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostingController {

    @PostMapping(value = "/cadastroDeNome")
    public String postMethodName(@RequestBody String name) {
        return returnName(name);
    }

    @ResponseStatus(HttpStatus.OK)
    public String returnName(String name) {
        return name + " cadastrado com sucesso!";
    }

}
