package main;
import figures.*;


public class Figures  {
    public static void main(String[] args) {

        MyCircle c1 = new MyCircle("blue","Circle", 7);
        System.out.println(c1.getDescription());

        MyCircle c2 = new MyCircle("purple","Circle",3);
        System.out.println(c2.getDescription());

        MyRectangle r1 = new MyRectangle("orange","Rectangle",5,2);
        System.out.println(r1.getDescription());

        MyRectangle r2 = new MyRectangle("red","Rectangle",8,7);
        System.out.println(r2.getDescription());


    }
}

