package esa.websocket.websocket.controller;

import esa.websocket.websocket.entity.Chat;
import esa.websocket.websocket.repository.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class ChatController {

    @Autowired
    private ChatRepository messageRepository;

    @Autowired
    private SimpMessagingTemplate messagingTemplate;
    public Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());

    @PostMapping
    public Chat postMessage(@RequestBody Chat message) {
        message.setTimestamp(currentTimestamp.toString());
        messageRepository.save(message);
        messagingTemplate.convertAndSend("/topic/messages", message);
        return message;
    }

    @GetMapping
    public List<Chat> getMessages() {
        return messageRepository.findAll();
    }
}
