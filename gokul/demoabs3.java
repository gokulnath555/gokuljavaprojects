abstract class sample
{
          sample(int x)
           {
            System.out.println("emp age is"+x);
           }
          
    abstract public void show(String str);
    abstract public void show1(int a,int b);
    abstract public void show2(double salary);
}
class sample1 extends sample
{
     sample1()
     {
      super(22);
     }  
     
      public void show(String str)
        {
           System.out.println("emp name is"+str);
        }
      public void show1(int a,int b)
         {
            int mul=a*b;
          System.out.println("multiplication"+mul);
         }
      public void show2(double salary)
        {
           System.out.println("emp salary"+salary);
         }
}
class demoabs3
{
        public static void main(String args[])
          {
                sample1 obj=new sample1();
                  obj.show("gokul");
                  obj.show1(22,34);
                  obj.show2(20000);
                
                 
          }
}