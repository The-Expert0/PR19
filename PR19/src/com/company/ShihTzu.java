package com.company;

public class ShihTzu extends Dog{
    public ShihTzu(String nickname, int age, String color, char gender, boolean sterilized) {
        super(nickname, age, color, gender, sterilized);
        dogBreed = "ShihTzu";
    }
    @Override
    public String dopInfo() {return "";}
}
