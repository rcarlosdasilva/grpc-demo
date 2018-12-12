package demo.grpc.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Bootstrap4Eureka {

    public static void main(String[] args) {
        SpringApplication.run(Bootstrap4Eureka.class, args);
    }
}
