package com.kodilla.testing.collection;

import java.util.*;

public class OddNumberExterminator {

    private ArrayList<Integer>newList;

    public OddNumberExterminator() {
        newList = new ArrayList<Integer>();
    }


    public ArrayList<Integer> exterminate(ArrayList<Integer>numbers){
        ArrayList<Integer> evenList = new ArrayList<Integer>();
        if(numbers.size() == 0){
            System.out.println("List is empty");
        }else{
            for(int i=0; i<numbers.size(); i++){
                if(numbers.get(i) % 2 == 0) {
                    evenList.add(numbers.get(i));
                }
            } System.out.println(evenList);
        }
        return evenList;
    }
}
