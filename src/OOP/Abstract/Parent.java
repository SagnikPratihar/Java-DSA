package OOP.Abstract;

public abstract class Parent {


    public Parent(int age) {

    }

    void normal(){
        System.out.println("happy happy");
    }
    static void greet(){
        System.out.println("Hello");
    }
    abstract void career();
    abstract void partner();
}
