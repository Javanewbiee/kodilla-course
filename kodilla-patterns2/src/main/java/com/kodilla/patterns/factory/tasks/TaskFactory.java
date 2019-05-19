package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String drivingTask = "DRIVING";
    public static final String paintingTask = "PAINTING";
    public static final String shoppingTask = "SHOPPING";

    public final Task makeTask(final String taskClass) {
        switch(taskClass) {
            case drivingTask:
                return new DrivingTask("Close Drive","Nearest bowling center", "Car");
            case paintingTask:
                return new PaintingTask("First Painting", "Black & White", "Fantasy image");
            case shoppingTask:
                return new ShoppingTask("Small shopping", "Cerials, milk",2.0);
            default:
                return null;
        }
    }
}
