package com.company;

public class Corgi extends Dog{
    public boolean shortTail;
    public Corgi(String nickname, int age, String color, char gender, boolean sterilized, boolean shortTail) {
        super(nickname, age, color, gender, sterilized);
        dogBreed = "Corgi";
        this.shortTail = shortTail;
    }
    public String dopInfo(){
        return "Short Tail: "+shortTail;
    }
}
