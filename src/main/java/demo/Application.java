package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@EnableAutoConfiguration
@Import({ Controller1.class })
public class Application {

    static {
        System.setProperty("error.whitelabel.enabled", "false");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
