import  java.io.*;
class sample
{
         DataInputStream obj1=new DataInputStream(System.in);
         public void show()
           {
                System.out.println("Enter your name");
              try 
                 {
                       String str =obj1.readLine();
                     System.out.println(str);
                 }catch(IOException g){}
          }
}
class demoio2
{
          public static void main(String args[])
             {
                        sample obj=new sample();
                              obj.show();
            }
}