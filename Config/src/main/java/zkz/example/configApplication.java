package zkz.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@SpringBootApplication
@EnableConfigServer
public class configApplication {
    public static void main(String[] args) {
        SpringApplication.run(configApplication.class,args);
    }
}
