package org.example.service;
import java.util.ArrayList;

public class Checklist {
    public String alllist(int positions){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Payel");
        names.add("Soumitra");
        names.add("Oindrila");
        names.add("Subhankar");
        names.add("Mrinal");
        names.add("Deboleena");
        String result;
        result = names.get(positions);
        System.out.println(result);
        return result;


    }



}
