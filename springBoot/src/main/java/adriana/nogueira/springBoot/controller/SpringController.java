package adriana.nogueira.springBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }
}