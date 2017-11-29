import java.io.*;
    class sample
        {
                             DataInputStream obj=new DataInputStream(System.in);
                          public void display()
                                       {
                                             System.out.println("Enter the number");
                                           try{
                                                      int a=Integer.parseInt(obj.readLine());
                                                      int b=Integer.parseInt(obj.readLine());
                                                      int tot=a+b;
                                                      System.out.println("Addition="+tot);
                                                }catch(IOException g){}
    		}
                   	         public void display1()
                                      {
                                             System.out.println("Enter the number");
                                           try{
                                                      int c=Integer.parseInt(obj.readLine());
                                                      int d=Integer.parseInt(obj.readLine());
                                                      int tot=c-d;
                                                      System.out.println("sub="+tot);
                                                }catch(IOException g){}
                                     }
                            public void display2()
                                      {
                                             System.out.println("Enter the number");
                                           try{
                                                      int e=Integer.parseInt(obj.readLine());
                                                      int f=Integer.parseInt(obj.readLine());
                                                      int tot=e*f;
                                                      System.out.println("mul="+tot);
                                                }catch(IOException g){}
                                     }
                          public void display3()
                                      {
                                             System.out.println("Enter the number");
                                           try{
                                                      int e=Integer.parseInt(obj.readLine());
                                                      int f=Integer.parseInt(obj.readLine());
                                                      int tot=e/f;
                                                      System.out.println("div="+tot);
                                                }catch(IOException g){}
                                     }
                           
                                     
          }
    class demoio4
       {
                                public static void main(String args[])
                                       {
                                                  sample obj1=new sample();
                            		obj1.display();
                                                          obj1.display1();
                                                          obj1.display2();
                                                          obj1.display3();
                                                          
       		}
       }






  

      
                                