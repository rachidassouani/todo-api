package io.rachidassouani.todoapi;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "hello world!";
    }

    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        HelloWorldBean helloWorldBean = new HelloWorldBean();
        helloWorldBean.setMessage("Hi from bean");
        return helloWorldBean;


    }
    @GetMapping("/hello-world/pathVariable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
        HelloWorldBean helloWorldBean = new HelloWorldBean();
        helloWorldBean.setMessage("Hi from bean" + name);
        return helloWorldBean;
    }
}
