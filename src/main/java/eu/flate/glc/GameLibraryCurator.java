package eu.flate.glc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GameLibraryCurator {

    public static void main(String[] args) {
//        final ConfigurableApplicationContext applicationContext =
//             new SpringApplicationBuilder(GameLibraryCurator.class)
//                                                                .properties().build().run(args);
        SpringApplication.run(GameLibraryCurator.class, args);
    }

}
