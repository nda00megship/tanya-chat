package esa.websocket.websocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebsocketApplication {

	@GetMapping("/")
	public String run(){
		return "berjalan bang";
	}

	public static void main(String[] args) {
		SpringApplication.run(WebsocketApplication.class, args);
	}

}
