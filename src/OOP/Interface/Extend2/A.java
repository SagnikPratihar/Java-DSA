package OOP.Interface.Extend2;

public interface A {
    //static interface methods always have a body
    static void greeting(){
        System.out.println("Hey I am in static method");
    }
    default void fun(){
        System.out.println("I am in A");
    }

}
