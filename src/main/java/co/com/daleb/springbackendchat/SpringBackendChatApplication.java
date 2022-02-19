package co.com.daleb.springbackendchat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SpringBackendChatApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBackendChatApplication.class, args);
  }
}
