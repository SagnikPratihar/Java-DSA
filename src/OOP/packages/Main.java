package OOP.packages;

public class Main {
    public static void main(String[] args) {
        Human sagnik=new Human(19,"Sagnik",0,false);
        Human kunal=new Human(23,"Kunal",10000,true);
        Human riya=new Human(18,"Riya",0,false);
        System.out.println(sagnik.name);
        System.out.println(Human.population);
     
    }
    //This is not dependent on object
    static void fun(){
      //  greeting();  //You can't use it because it requires an instance.
        //But the function you are using in it does not depend on instances.


        //Cannot access non-static stuff without using referring their instances in a static context.
        Main obj=new Main();
        obj.greeting();
    }

    void fun2(){
        greeting();
    }

    //Thi is dependent on object
    void greeting(){
        fun();
        System.out.println("Welcome");
    }
}
