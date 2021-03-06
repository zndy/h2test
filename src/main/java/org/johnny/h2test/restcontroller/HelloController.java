package org.johnny.h2test.restcontroller;

import org.johnny.h2test.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello(HttpServletRequest request) {
        String name = request.getRemoteAddr();
        return helloService.sayHello(name);
    }

    @GetMapping("/hello2")
    public String hello2(HttpServletRequest request) {
        String name = request.getRemoteAddr();
        name = returnWas();
        return helloService.sayHello(name);//highlight, if name == null
    }

    private String returnWas() {
        return null;
    }
}
