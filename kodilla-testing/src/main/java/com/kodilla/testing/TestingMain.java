package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        Calculator calculate = new Calculator();

        int sumResult = calculate.add(5,5);
        int substractResult = calculate.substract(5,5);

        if(sumResult == 10){
            System.out.println("Test OK");
        }else{
            System.out.println("Error");
        }
        if(substractResult == 0){
            System.out.println("Test OK");
        }else{
            System.out.println("Error");
        }
    }
}
