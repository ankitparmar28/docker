package com.kroger.docker.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chamith
 */
@RestController
public class DockerDemoController {

    @GetMapping("/getItems")
    public String testDemo(){
        return "[\"Phone\",\"Tablet\",\"Desktop\"]";
    }
}
