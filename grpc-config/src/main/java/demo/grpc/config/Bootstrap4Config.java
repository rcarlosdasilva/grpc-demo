package demo.grpc.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Bootstrap4Config {

    public static void main(String[] args) {
        SpringApplication.run(Bootstrap4Config.class, args);
    }
}
