package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautifier(String toDecorate, PoemDecorator doDecorate){
        String result = doDecorate.decorate(toDecorate);
        System.out.println(result);
    }
}
