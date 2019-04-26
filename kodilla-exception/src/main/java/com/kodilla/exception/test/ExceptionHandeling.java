package com.kodilla.exception.test;

import com.kodilla.exception.test.SecondChallenge;

public class ExceptionHandeling {

    public static void main(String args[]) {

        SecondChallenge second = new SecondChallenge();

        try {
            second.probablyIWillThrowException(2.0, 1.5);
        } catch (Exception e) {
            System.out.println("Bug " + e);
        } finally {
            System.out.println("All done");
        }
    }
}
