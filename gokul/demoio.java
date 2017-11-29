   import java.io.*;
   class sample
{
             DataInputStream obj1=new DataInputStream(System.in);
             public void show()
               {
                          System.out.println("Enter your name");
                 try{
                             String str=obj1.readLine();
                             System.out.println(str);
                      }     catch(IOException d){}
              }
             public void show1()
               {
                        System.out.println("Enter your lastname");
                try{
                             String str=obj1.readLine();
                             System.out.println(str);
                    }       catch(IOException d){}
            }
          public void show2()
             {
                      System.out.println("Enter your city");
               try{
                         String str=obj1.readLine();
                         System.out.println(str);
                    }     catch(IOException d){}
              }
         public void show3()
            {
                     System.out.println("Enter your state");
              try{
                          String str=obj1.readLine();
                          System.out.println(str);
                    }    catch(IOException d){}
            }
       
}
class demoio
{
        public static void main(String args[])
          {
               sample obj=new sample();
                 obj.show();
                 obj.show1();
                 obj.show2();
                 obj.show3();
          }

}
        