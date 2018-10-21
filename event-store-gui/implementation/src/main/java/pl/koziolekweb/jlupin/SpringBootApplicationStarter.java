package pl.koziolekweb.jlupin;

import pl.koziolekweb.jlupin.configuration.EventStoreGuiSpringConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApplicationStarter {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(EventStoreGuiSpringConfiguration.class, args);
    }
}

