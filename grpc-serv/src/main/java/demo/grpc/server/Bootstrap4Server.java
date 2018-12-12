package demo.grpc.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class Bootstrap4Server {

    public static void main(String[] args) {
        SpringApplication.run(Bootstrap4Server.class, args);
    }
}
