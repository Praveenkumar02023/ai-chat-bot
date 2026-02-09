package com.example.service;

import org.springframework.stereotype.Service;

import com.example.model.chatModel;
import com.example.repository.chatRepository;

@Service
public class chatService {

    private chatRepository chatRepository;

    public chatService(chatRepository chatRepository) {
        this.chatRepository = chatRepository;
    }

    public chatModel addRequest(chatModel request) {

        return this.chatRepository.save(request);
    }

}
