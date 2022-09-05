package co.develhope.deployenvironmentvariables01exercise.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class environmentController {

    @Autowired
    private Environment environment;

    @GetMapping
    public String getEnvironment(){
        return "Welcome " + environment.getProperty("myCustomVar.devName") + " your authCode is: " +environment.getProperty("myCustomVar.authCode");
    }
}
