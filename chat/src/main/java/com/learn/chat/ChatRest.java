package com.learn.chat;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.chat.Dto.Messages;

import java.util.List;

import org.apache.hc.core5.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/chat")
public class ChatRest {

    @Autowired
    private ChatService chatService;

    @PostMapping("/")
    public ResponseEntity<String> createChat() {
        //TODO: process POST request
        
        return new ResponseEntity<String>(chatService.createChat(), org.springframework.http.HttpStatus.OK);
    }

    @PostMapping("/{id}")
    public ResponseEntity<Messages> chat(@PathVariable String id , @RequestBody Messages messages) {
        //TODO: process POST request
        
        return new ResponseEntity<Messages>(chatService.getFromModel(id,messages), org.springframework.http.HttpStatus.OK);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<List<Messages>> getMethodName(@PathVariable String id) {
        return new ResponseEntity<List<Messages>>(chatService.getAllMessages(id), org.springframework.http.HttpStatus.OK);
    }
    
}
