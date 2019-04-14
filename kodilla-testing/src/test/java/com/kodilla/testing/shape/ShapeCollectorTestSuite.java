package com.kodilla.testing.shape;

import org.junit.*;


public class ShapeCollectorTestSuite {

    private static int counter = 0;

    @BeforeClass

    public static void beforeClass(){
        System.out.println("Staring test");
    }
    @AfterClass

    public static void afterClass(){
        System.out.println("Test ended");
    }
    @Before
    public void before(){
        counter++;
        System.out.println("Testing method # " + counter);
    }
    @After

    public void after(){
        System.out.println("Method tested");
    }
    @Test
    //Given
    public void testAddFigure(){
        //Given
        Shape circle = new Circle("Circle", 20.5);
        ShapeCollector shape = new ShapeCollector(circle);
        //When
        shape.addFigure(circle);
        //Then
        Assert.assertEquals(1, shape.getSize());
    }
    @Test
    public void testRemoveFigure(){
        //Given
        Shape triangle = new Triangle("Triangle", 15.0);
        ShapeCollector shape = new ShapeCollector(triangle);
        shape.addFigure(triangle);
        //When
        shape.removeFigure(triangle);
        //Then
        Assert.assertEquals(0, shape.getSize());
    }
    @Test
    public void testGetFigure(){
        //Given
        Shape square = new Square("Square", 8.0);
        ShapeCollector shape = new ShapeCollector(square);
        shape.addFigure(square);
        //When
        Shape retrieved = shape.getFigure(0);
        //Then
        Assert.assertEquals(square,retrieved);
    }
    @Test
    public void testShowFigures(){
        //Given
        Shape circle = new Circle("Circle", 20.5);
        ShapeCollector shape = new ShapeCollector(circle);
        shape.addFigure(circle);
        //When
        shape.showFigures();
    }


}
