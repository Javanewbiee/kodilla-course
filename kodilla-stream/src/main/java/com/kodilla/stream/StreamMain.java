package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier poem = new PoemBeautifier();
        poem.beautifier("Zdjecie", toDecorate -> toDecorate.toUpperCase());
        poem.beautifier("OKNO", toDecorate -> toDecorate.toLowerCase());
        poem.beautifier("Blocki", toDecorate -> toDecorate.replace('B', 'K'));

    }
}
