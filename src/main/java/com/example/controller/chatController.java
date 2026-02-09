package com.example.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.chatModel;
import com.example.service.chatService;

@RestController
public class chatController {

    private chatService chatService;

    public chatController(chatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping("/chat/add")
    public chatModel addRequest(@RequestBody chatModel request) {

        return this.chatService.addRequest(request);

    }
}
