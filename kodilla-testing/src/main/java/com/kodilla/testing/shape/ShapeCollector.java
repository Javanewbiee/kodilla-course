package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {


    private ArrayList<Shape>collection = new ArrayList<Shape>();

    public void addFigure(Shape shape){
        collection.add(shape);
    }
    public boolean removeFigure(Shape shape){
        boolean removed = false;
        if(collection.contains(shape)){
            collection.remove(shape);
            removed = true;
        }return removed;
    }
    public Shape getFigure(int n){
        Shape theShape = null;
        if(n>=0 && n<collection.size()){
            theShape = collection.get(n);
        } return theShape;
    }
    public void showFigures(){
        System.out.println(collection);
    }
    public int getSize(){
        return collection.size();
    }
}
