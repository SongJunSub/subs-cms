package com.songjunsub.subscms.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class NotificationController {
    private final SimpMessagingTemplate messagingTemplate;

    @PostMapping("/api/notify")
    public void notifyAll(@RequestBody String message) {
        messagingTemplate.convertAndSend("/topic/notifications", message);
    }

    @MessageMapping(/hello)
    @SendTo(/topic/notifications)
    public String greeting(String message) {
        return message;
    }
}

