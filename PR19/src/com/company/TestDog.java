package com.company;

public class TestDog {

    public static void main(String[] args) {
    Corgi corgi = new Corgi("Belka", 2, "red", 'w', true, false);
    corgi.dogInfo();
    Shepherd shepherd = new Shepherd("Jack", 5, "black", 'm', false, true);
    shepherd.dogInfo();
    ShihTzu shihTzu = new ShihTzu("Liza", 1, "white", 'W', false);
    shihTzu.dogInfo();
    }
}
