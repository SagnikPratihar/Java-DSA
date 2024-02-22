package OOP.Generics;

import java.util.Arrays;



//Here T either be Number or its subclasses
public class WildCards<T extends Number> {
    private Object[] data;
    private static int default_length=10;
    private int size=0;  //Also work as index

    public WildCards() {
        this.data=new Object[default_length];
    }

//    public void getList(List <? extends Number> List){
//
//    }
    public void add(int num){
        if(isfull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        Object[] temp=new Object[data.length*2];
        for (int i = 0; i <data.length ; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }

    private boolean isfull() {
        return size==data.length;
    }

    public T remove(){
        T remove= (T) data[--size];
        return remove;
    }

    public int size(){
        return size;
    }
    public T get(int index){
        return (T)data[index];
    }
    public void set(int index,T value){
        data[index]=value;;
    }

    @Override
    public String toString() {
        return "CoustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
     //   ArrayList list=new ArrayList();
        WildCards<Number> a=new WildCards<>();
        a.add(2);
        a.add(5);
        a.add(3);

        System.out.println(a);


    }
}
