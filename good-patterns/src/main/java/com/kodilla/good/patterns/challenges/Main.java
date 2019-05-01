package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args){

        MovieStore store = new MovieStore();

        String storeList = store.getMovies().entrySet().stream()
                .flatMap(n -> n.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(storeList);
    }
}
