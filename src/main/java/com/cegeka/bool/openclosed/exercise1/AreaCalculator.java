package com.cegeka.bool.openclosed.exercise1;

import com.cegeka.bool.openclosed.exercise1.shapes.Rectangle;
import com.cegeka.bool.openclosed.exercise1.shapes.Triangle;

public class AreaCalculator {

    //Maak de area calculator generieker zodat 1 methode door alle vormen gebruikt kan worden.
    //Voeg de cirkel toe, vervolledig de test...
    //Voeg nog 1 vorm naar keuze toe, vervolledig de test..

    public double calculateRectangleArea(Rectangle rectangle){
        return rectangle.getLength()*rectangle.getWidth();
    }

    public double calculateTriangleArea(Triangle triangle){
        return (triangle.getWidth() * triangle.getHeight())/2;
    }
}
