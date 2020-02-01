package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    @Before
    public void before() {
        System.out.println("Test case: Begin");
    }

    @After
    public void after() {
        System.out.println("Test case: End");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testAddFigure() {
        //Given
        Shape shape = new Triangle();
        Shape shape1 = new Square();
        Shape shape2 = new Circle();
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(shape);
        shapeCollector.addFigure(shape1);
        shapeCollector.addFigure(shape2);

        //Then
        Assert.assertEquals(shape, shapeCollector.getFigure(0));
        Assert.assertEquals(shape1, shapeCollector.getFigure(1));
        Assert.assertEquals(shape2, shapeCollector.getFigure(2));
    }

    @Test
    public void testRemoveFigure() {
        //Given
        Shape shape = new Triangle();
        Shape shape1 = new Square();
        Shape shape2 = new Circle();
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(shape);
        shapeCollector.addFigure(shape1);
        shapeCollector.addFigure(shape2);
        //When
        ShapeCollector result = new ShapeCollector();
        shapeCollector.removeFigure(shape);
        shapeCollector.removeFigure(shape1);
        shapeCollector.removeFigure(shape2);

        //Then
        Assert.assertEquals(result, shapeCollector);
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Triangle();
        shapeCollector.addFigure(shape);
        //When
        Shape result = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(shape, result);
    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square();
        shapeCollector.addFigure(shape);
        //When
        String result = shapeCollector.showFigures();
        //Then
        Assert.assertEquals("Squares: 1", result);
    }

}
