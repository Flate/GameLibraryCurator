package eu.flate.glc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class GameLibraryCurator {

    public static void main(String[] args) {
        SpringApplication.run(GameLibraryCurator.class, args);
    }

}
