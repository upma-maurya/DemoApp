package com.example.demoapp;

public class ModalClass {
    private int image1;
    private String text1="";
    private String text2="";

    ModalClass(int image1, String text1, String text2)
    {
        this.image1=image1;
        this.text1=text1;
        this.text2=text2;
    }

    public int getImage1() {
        return image1;
    }

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }
}
