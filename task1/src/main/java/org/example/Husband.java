package org.example;

// реализуй паттерн Singleton
// в России нельзя иметь двух мужей
public class Husband {
    private static Husband instance;

    private Husband() {
    }
    // если муж уже есть, то вернуть его
    // если мужа нет, то создать и вернуть
    public static Husband getInstance() {
        if (instance == null) {
            instance = new Husband();
        }
        return instance;
    }
}
