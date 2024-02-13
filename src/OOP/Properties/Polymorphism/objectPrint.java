package OOP.Properties.Polymorphism;

public class objectPrint {
    int num;

    public objectPrint(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "objectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        objectPrint obj=new objectPrint(88);
        System.out.println(obj);

    }
}
