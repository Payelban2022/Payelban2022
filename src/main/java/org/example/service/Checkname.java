package org.example.service;

public class Checkname {
    public String allname (int position) {
        String[] name = {"Payel", "Soumitra", "Oindrila", "Subhankar", "Mrinal", "Deboleena"};
        int nameLength = name.length;
        String result;
        if (position >= 0 && position < nameLength) {
            result = name[position];
        } else {
            result = "Not accepted";
        }
        return result;

    }
}
