package OOP.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CoustomArrayList {
    private int[] data;
    private static int default_length=10;
    private int size=0;  //Also work as index

    public CoustomArrayList() {
        this.data=new int[default_length];
    }

    public void add(int num){
        if(isfull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        int[] temp=new int[data.length*2];
        for (int i = 0; i <data.length ; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }

    private boolean isfull() {
        return size==data.length;
    }

    public int remove(){
        int remove=data[--size];
        return remove;
    }

    public int size(){
        return size;
    }
    public int get(int index){
        return data[index];
    }
    public void set(int index,int value){
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
        CoustomArrayList a=new CoustomArrayList();
        a.add(2);
        a.add(5);
        a.add(3);

        System.out.println(a);


    }
}
