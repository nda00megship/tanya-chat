package esa.websocket.websocket.repository;

import esa.websocket.websocket.entity.Chat;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChatRepository extends MongoRepository<Chat, String> {
}
