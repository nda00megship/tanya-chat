package esa.websocket.websocket.entity;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Date;
import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "messages")
public class Chat {

    @Id
    private String id;
    private String sender;
    private String content;
    private String timestamp;
    private String username; // Tambahkan atribut username

}