package com.company;

public class Shepherd extends Dog{
    public boolean trained;
    public Shepherd(String nickname, int age, String color, char gender, boolean sterilized, boolean trained) {
        super(nickname, age, color, gender, sterilized);
        dogBreed = "Shepherd";
        this.trained = trained;
    }

    @Override
    public String dopInfo() {
        return "Trained: "+trained;
    }
}
