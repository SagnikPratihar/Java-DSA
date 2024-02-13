package OOP.singleton;

public class SingletonClass {
    private SingletonClass(){

    }
    private static SingletonClass instance;
    public static SingletonClass getInstance(){

        //check whether 1 obj is created or not
        if(instance==null){
            instance=new SingletonClass();
        }
        return instance;
    }
}
