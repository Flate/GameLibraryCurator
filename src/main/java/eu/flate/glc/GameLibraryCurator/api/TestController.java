package eu.flate.glc.GameLibraryCurator.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(path = "/api/v1/")
public class TestController {

    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World! Wazzup?";
    }
}

