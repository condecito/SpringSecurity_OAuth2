package com.app.main.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/secured/resources")
public class SecuredResource {

    @GetMapping("/about")
    public String getAbout() {
        return "secured resource";
    }

}
