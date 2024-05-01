package OOP.Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human sagnik = new Human(19, "Sagnik");
//        Human temp=new Human(sagnik);

        Human temp = (Human) sagnik.clone();
        System.out.println(temp.age + " " + temp.name);
        System.out.println(Arrays.toString(temp.arr));
        temp.arr[0] = 100;
        System.out.println(Arrays.toString(temp.arr));
        System.out.println(Arrays.toString(sagnik.arr));

    }
}
