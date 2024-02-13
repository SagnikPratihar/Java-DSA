package OOP.singleton;

public class main {
    public static void main(String[] args) {
        SingletonClass obj=SingletonClass.getInstance();

        SingletonClass obj2=SingletonClass.getInstance();

        SingletonClass obj3=SingletonClass.getInstance();

        //All three ref variable pointing to just one object
    }
}
