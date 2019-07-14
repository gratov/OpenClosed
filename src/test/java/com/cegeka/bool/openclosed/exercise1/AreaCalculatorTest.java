package com.cegeka.bool.openclosed.exercise1;

import com.cegeka.bool.openclosed.exercise1.shapes.Rectangle;
import com.cegeka.bool.openclosed.exercise1.shapes.Triangle;
import javafx.scene.shape.Circle;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class AreaCalculatorTest {

    private AreaCalculator areaCalculator;

    @Before
    public void setUp() throws Exception {
        this.areaCalculator = new AreaCalculator();
    }

    @Test
    public void calculateRectangleArea() {
        Rectangle rectangle = new Rectangle(5d, 5d);
        double area = areaCalculator.calculateRectangleArea(rectangle);

        assertThat(area).isEqualTo(25d);
    }

    @Test
    public void calculateTriangleArea() {
        Triangle triangle = new Triangle(10d,5d);
        double area = areaCalculator.calculateTriangleArea(triangle);

        assertThat(area).isEqualTo(25d);
    }

    //*******************************************//
    //**************Spoiler-Alert****************//
    //*******Volgende testen bevatten hints******//
    //*******************************************//

//    @Test
//    public void calculateCircleArea() {
//        Circle circle = new Circle(10);
//        double area = areaCalculator.calculateArea(circle);
//
//        assertThat(area).isEqualTo(314d);
//    }
//
//    @Test
//    public void calculateArea_UserShape(){
//        Shape shape = new Usershape();
//        double area = areaCalculator.calculateArea(shape);
//
//        assertThat(area).isEqualTo(shape.getArea());
//    }
}