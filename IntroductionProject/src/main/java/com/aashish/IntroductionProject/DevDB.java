package com.aashish.IntroductionProject;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="deploy.env",havingValue = "dev")
public class DevDB implements DB {

    public String getData() {
        return "Dev Data";
    }
}
