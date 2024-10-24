package task4;

import java.util.ArrayList;

public class ShapeBuilder {

    //ArrayList der kan indeholde Shape objekter
    ArrayList<Shape> shapes = new ArrayList<>();

    //Metode der tilføjer Shape objekter til shapes ArrayList'en
    public void addShape (Shape s){
        shapes.add(s);
    }

    //Metode til at finde det samlede areal af alle Shape objekter i ArrayListen
    public double getTotalArea(){
        double totalArea = 0;  //Variabel til at indeholde det samlede areal
        for (Shape s : shapes) {   //Loop der løber hele shapes ArrayListen igennem for
            s.getArea();           //Shape objekter og kalder getArea-metoden på hver enkelt
            totalArea += s.getArea(); //Arealet for hvert objekt tillægges variablen totalArea
        }
        return totalArea;
    }
}
