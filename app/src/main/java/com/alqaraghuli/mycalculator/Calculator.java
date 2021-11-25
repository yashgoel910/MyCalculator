package com.alqaraghuli.mycalculator;

public class Calculator {
    String numberString="0";
    String detailsString="";
    long intNumber=0;

    public Calculator() {
    }

    public void processNumber(int i) {
        if(numberString.length()<12) {  // limit of 12 digits
            intNumber = intNumber * 10 + i;
            numberString = String.valueOf(intNumber);
            detailsString = "Clicked: "+i;
        }
        else
            detailsString="The number is too long..";
    }

}
