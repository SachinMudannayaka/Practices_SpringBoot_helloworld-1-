package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class hello {
    @RequestMapping("/")
    
   public String helloworld(){

        return "<h1>HELLO WORLD Sachi</h1>";
    }
}
