package org.example;

public class Main {
    public static void main(String[] args) {
        // создать двух мужей
        Husband firstHusband = Husband.getInstance();
        Husband secondHusband = Husband.getInstance();
        // проверить, что это один и тот же муж
        System.out.println(firstHusband == secondHusband);
    }
}