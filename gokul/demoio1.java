import java.io.*;
class sample
{
     DataInputStream obj2=new DataInputStream(System.in);
   public void display()
     {
         System.out.println("Enter the number");
         try
          {
            String str=obj2.readLine();
            System.out.println(str);
          }catch(IOException e){}
      }

 }
class demoio1
{
       public static void main(String args[])
          {
             sample obj=new sample();
               obj.display();
          }
}