package com.learn.model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.model.Dto.Messages;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/model")
public class ModelRest {

    @PostMapping("/")
    public ResponseEntity<Messages> Modelresp(@RequestBody Messages userMessages) {
        Messages messages = new Messages();
        messages.setChatId(userMessages.getChatId());
        messages.setRole("system");
        messages.setContent("REPLIED BY THE MODEL");
        return new ResponseEntity<Messages>(messages, HttpStatus.OK);

    }
    

}
