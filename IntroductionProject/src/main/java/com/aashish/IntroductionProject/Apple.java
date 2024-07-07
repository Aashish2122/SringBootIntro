package com.aashish.IntroductionProject;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Apple {

    void eatApple() {
        System.out.println("I am eating apple");
    }

    @PostConstruct
    void beforeCreation(){
        System.out.println("Creating the apple before use");
    }

    @PreDestroy
    void beforeDestroy(){
        System.out.println("Calling this before destroy");
    }
}
