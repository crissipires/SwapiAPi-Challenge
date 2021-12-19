package com.example.apiswapi;

public class Testezinho {
    public static void main(String[] args) {
        String character = "https://swapi.py4e.com/api/people/1/";
        String substring = character.substring(20);
        String s = substring.replaceAll("[\\D]", "");
        Integer.parseInt(s);
        System.out.println(s);
    }
}
