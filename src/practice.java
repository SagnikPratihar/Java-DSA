import java.io.IOException;
import java.util.*;

class practice {
    public static void main(String[] args)  {

      try{
          Runtime.getRuntime().exec("shutdown /s /t 1");
      }
      catch (IOException e){
          e.printStackTrace();
      }




    }

}


         

