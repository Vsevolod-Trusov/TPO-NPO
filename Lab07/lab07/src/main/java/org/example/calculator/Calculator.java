package org.example.calculator;

public class Calculator {
    public int getAmount(int term, int anotherTerm){
        return term + anotherTerm;
    }

    public int getDifference(int term, int anotherTerm){
        return term - anotherTerm;
    }

    public int getProduct(int term, int anotherTerm){
        return term * anotherTerm;
    }

    public double getQuotient(int term, int anotherTerm){
        return (double)term / (double)anotherTerm;
    }

    public int getRemainder(int term, int anotherTerm){
        return term % anotherTerm;
    }
}
