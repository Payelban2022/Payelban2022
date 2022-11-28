package org.example.service;

import org.springframework.stereotype.Service;

@Service
public class Checkcountry {
    public String allcountry(String countryname){
        String result;
        System.out.println(countryname);
        if(countryname.equals("usa")){
              result="this is the dat";
            for (int i = 0; i < 5; i++) {
                result=result+ "\n" + "this is the data";
            }
        }else {
             result="do not have data";
        }
        return result;
    }
}
