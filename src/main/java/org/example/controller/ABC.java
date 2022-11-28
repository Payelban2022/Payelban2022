package org.example.controller;

import org.example.service.Checkcount;
import org.example.service.Checkcountry;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/autism")
public class ABC {

    @GetMapping
    public String autism(){
        return "this is my autism project";
    }

    @GetMapping("/toddler")
    public String todlerData(){
        return "payel";
    }
    @GetMapping("/adult")
    public String adultData(){
        return "Soumitra";
    }
//    this is for path parameter check32
    @GetMapping("/toddler/{country}")
    public String todlerData(@PathVariable String country) {
        Checkcountry object1 = new Checkcountry();
        return object1.allcountry(country);
    }
    @GetMapping("/numbercheck/{count}")
    public String todlerData(@PathVariable int count){
            Checkcount object2 = new Checkcount();
            return object2.allcount(count);
        }



}
