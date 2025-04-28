package com.example.helloworld;
import com.example.helloworld.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;


@RestController
public class HelloController {

    private static final String TEMPLATE = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @GetMapping("/")
    public String hello() {
        return "hello world";
    }

    @GetMapping("/greeting")
    public String greeting(){
        return "welcome to sping boot";
}

@GetMapping("/api/greeting")
public Greeting greetingJson(@RequestParam(value = "name",defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(), String.format(TEMPLATE, name));
}
}
