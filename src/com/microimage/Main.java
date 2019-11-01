package com.microimage;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
	// write your code here
       // Mobile newphone = new Iphone();
        Mobile newPhone =  MobileFactory.getMobile(MobileType.LOW);
        System.out.println(newPhone.spec());
        System.out.println(newPhone.getYear());

    }
}
