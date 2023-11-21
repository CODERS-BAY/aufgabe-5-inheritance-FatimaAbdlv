# Inheritance

Develop a Java program, which builds a hierarchy of classes and interfaces and propagates the
inheritance all the way from the top down. The hierarchy should consist of one **figures.IFigure** Interface, one
Abstract **figures.Figure** Class, one **figures.Circle** and one **figures.Rectangle** class, and one **figures.MyCircle** and **figures.MyRectangle** Final
class, creating a 4-level hierarchy.

## Interface

The **figures.IFigure** Interface should declare methods for calculating the area, *calculateArea()*, and
the perimeter, *calculatePerimeter()*, of figures and *getName* method returning the name of the figure

## Abstract Class figures.Figure

The abstract **figures.Figure** class should implement that interface, should store the figure name and implement the
*getName()*
method.

## figures.Circle and figures.Rectangle

The **figures.Circle** and the **figures.Rectangle** classes should extend the abstract **figures.Figure** class, initialize with
the corresponding figure name and respective attributes (radius, length, width), and furthermore implement the two
methods
of the Interface computing the area and the perimeter of figures.

## figures.MyCircle and figures.MyRectangle

Finally, the **figures.MyCircle** and **figures.MyRectangle** Final classes should extend **figures.Circle** and **figures.Rectangle** respectively,
store the color attribute and implement a
getDescription method, as shown below.

~~~
My blue figures.Circle has 43,98 perimeter and 153,94 area.
My purple figures.Circle has 18,85 perimeter and 28,27 area.
My orange figures.Rectangle has 14,00 perimeter and 10,00 area.
My red figures.Rectangle has 30,00 perimeter and 56,00 area.
~~~

The main method is already given in the **main.Figures** Class. You should implement the tasks above and then uncomment
the lines in the main method.
You can also add more test cases if you want. Create the requested 4-level
hierarchy that would produce this output with the provided test program. Structure your classes in the corresponding
packages and give the packages meaningful names. For this task, one additional package besides the **main** is enough. 