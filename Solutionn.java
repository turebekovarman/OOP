import java.util.*;
import java.io.*;

public class Solutionn{
   public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
      double n=in.nextDouble();
      in.nextLine();
      HashMap<String, Double> hm = new HashMap<String, Double>();
      
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         double phone=in.nextDouble();
         hm.put(name, phone);         
         in.nextLine();
      }
      while(in.hasNext())
      {
         String s=in.nextLine();
         try{
            double temp = hm.get(s);
            System.out.println(s+"="+temp);
         }catch(NullPointerException e){
            System.out.println("Not found");
         }    
      }
   }
}