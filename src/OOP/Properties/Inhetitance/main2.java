package OOP.Properties.Inhetitance;



public class main2 {
    public static void main(String[] args) {
       Box box1=new Box(4.6, 7.9, 9.9);
       // Box box2=new Box(box1);
       // System.out.println(box1.l+" "+box1.w+" "+box1.h);
        //System.out.println(box2.l+" "+box2.w+" "+box2.h);

//        BoxWeight box3=new BoxWeight();
//        System.out.println(box3.h+" "+box3.weight);

//        Box box4=new BoxWeight(4.0,6.0,7.0,8.0);
        /*
        There are many variables in both parent class and child classes you are given access to variables that are
        in the ref type i.e. BoxWeight hence, you should have access to weight variable this also means, that the ones you
        are trying to access should be initialised but here, when the object itself is of type parent class, how will you
        call the child class this is why
         */
//        BoxWeight box5=new Box(3,6,8);  //shows error

        BoxPrice box6=new BoxPrice(4,8,200);
    }
}
