package com.learn.chat;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.learn.chat.Dto.Messages;

@FeignClient("MODEL")
public interface ModeChat {

     @PostMapping("model/")
    public ResponseEntity<Messages> Modelresp(@RequestBody Messages userMessages) ;
}
