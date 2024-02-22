package OOP.Generics.Comparing;

public class Main {
    public static void main(String[] args) {
        Student sagnik=new Student(12,92.98f);
        Student kunal=new Student(1,99.9f);

        if (sagnik.compareTo(kunal) < 0) {
            System.out.println("Kunal gets more marks");
        }

    }
}
