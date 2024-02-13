package OOP;

public class ObjectDemo {
    int num;
    ObjectDemo(int num){
       this.num=num;
    }
    @Override
    public String toString() {
        return "Access{}";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj=new ObjectDemo(34);
        //System.out.println(obj.hashCode());
        System.out.println(obj.getClass());
        

    }

}
