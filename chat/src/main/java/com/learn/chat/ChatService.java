package com.learn.chat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.chat.Dto.Messages;

@Service
public class ChatService {

    private Map<String,List<Messages>> message;

    @Autowired
    private ModeChat modeChat;

    public ChatService() {
        message = new HashMap<>();
    }

    public String createChat() {
        String chat_id= UUID.randomUUID().toString();
        message.put(chat_id, new ArrayList<>());
        return chat_id;
    }

    public Messages getFromModel(String chat_id , Messages messages) {
        // call the Service 
        message.get(chat_id).add(messages);
        Messages model_message = modeChat.Modelresp(messages).getBody();
         message.get(chat_id).add(model_message);
        return model_message;
    }

    public List<Messages> getAllMessages(String chat_id) {
        // call the Service 
        
        return message.get(chat_id);
    }
}
