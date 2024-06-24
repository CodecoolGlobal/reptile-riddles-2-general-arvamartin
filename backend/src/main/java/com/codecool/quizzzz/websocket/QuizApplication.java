package com.codecool.quizzzz.websocket;

import com.corundumstudio.socketio.Configuration;
import com.corundumstudio.socketio.SocketIOServer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class QuizApplication {

  @Value("${rt-server.port}")
  private Integer port;

  @Bean
  public SocketIOServer socketIOServer() {
    Configuration config = new Configuration();
    config.setPort(port);
    return new SocketIOServer(config);
  }
}
