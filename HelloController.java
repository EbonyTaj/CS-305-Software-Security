package com.snhu.sslserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Welcome to the Secure Web Application";
    }

    @GetMapping("/checksum")
    public String checksum() {
        return "Checksum: ab2aca08da294c82c67ae581bb5d309004220bece2ee07a84e13902029daa2cb";
    }
}
