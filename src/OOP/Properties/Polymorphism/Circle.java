package OOP.Properties.Polymorphism;

public class Circle extends Shapes{
    //this will run when object of circle is created hence it is overrefined the parents class.
    @Override //this is called annotations
    void Area(){
        System.out.println("Area is pi * r * r");
    }
}
