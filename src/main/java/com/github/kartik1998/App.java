package com.github.kartik1998;

public class App {
    public static void main(String[] args) {
        String s1 = "work";
        String s2 = "works";
        System.out.println(EditDistance.calculateEditDistance(s1, s2));
    }
}
