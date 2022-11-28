package org.example.service;

public class Checkcount {
    public String allcount(int count){
        String result;
        if (count == 0) {
            result = "Not accepted";
        }
        else if
        (count > 0) {
            if (count % 2 == 1) {
                result = "Odd";
            } else {
                result = "Even";
            }
        }
        else {
            count = count * -1;

            if (count % 2 == 1){
                result = "Odd";
            }
            else {
                result = "Even";
            }
            }
        return result;
    }
}
