package OOP.Cloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(int age,String name) {
        this.age = age;
        this.name=name;
        this.arr=new int[]{3,5,32,7};
    }

    public Human(Human other) {
        this.age=other.age;
        this.name=other.name;
    }

    @Override
//    public Object clone() throws CloneNotSupportedException {
//        // This is shallow copy
//        return super.clone();
//    }
    public Object clone() throws CloneNotSupportedException {
        // This is deep copy
        Human twin=(Human)super.clone(); //This is actually a shallow copy

        //Make a deep copy
        twin.arr=new int[twin.arr.length];
        for (int i = 0; i <twin.arr.length ; i++) {
            twin.arr[i]=this.arr[i];
        }

        return twin;
    }
}
