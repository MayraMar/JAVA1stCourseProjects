package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Nave nave=new Nave (3,5,'N',450.0);
        Asteroide aster=new Asteroide(0,0,'E',1000);
        System.out.println(aster.toString());
        aster.irA(9,9,'S');
        System.out.println(aster.toString());

    }
}
