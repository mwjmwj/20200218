package top.flcp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class FlcpApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlcpApplication.class, args);
    }

}
