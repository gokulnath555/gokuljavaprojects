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
          }
    class demoio3
       {
                                public static void main(String args[])
                                       {
                                                  sample obj1=new sample();
                            		obj1.display();
       		}
       }
      
                                      