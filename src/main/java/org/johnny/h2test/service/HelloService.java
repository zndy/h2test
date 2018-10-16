package org.johnny.h2test.service;

import org.springframework.stereotype.Service;
import org.jetbrains.annotations.NotNull;
@Service
public class HelloService {
    public String sayHello(@NotNull String receiver){
        return "hello " + receiver;
    }
}
