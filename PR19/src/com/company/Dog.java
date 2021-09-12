package com.company;

public abstract class Dog {
    protected String dogNickname;
    protected String dogBreed;
    protected int dogAge;
    protected String dogColor;
    protected char dogGender;
    protected boolean dogSterilized;
    public Dog(String nickname, int age, String color, char gender, boolean sterilized){
        dogNickname = nickname;
        dogBreed = "";
        dogAge = age;
        dogColor = color;
        dogGender = gender;
        dogSterilized = sterilized;
    }
    public void dogInfo(){
        System.out.println(
                "\nNickname: "+this.dogNickname+"\n"+
                "Breed: "+this.dogBreed+"\n"+
                "Age: "+this.dogAge+"\n"+
                "Color: "+this.dogColor+"\n"+
                "Gender: "+this.dogGender+"\n"+
                "Sterilized: "+this.dogSterilized+"\n"+
                dopInfo()
        );
    }
    public abstract String dopInfo();
}