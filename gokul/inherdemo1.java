class sample
{
      int a,b;
      sample(int a,int b)
        {
          int tot=a-b;
          System.out.println("to subtract the value"+tot);
        }
}

class sample1 extends sample
{
       
        sample1(int a,int b,int c)
            
          { 
             super(a,c);
            int tot=b*c;
             System.out.println("to multiply the value"+tot);
           }
}

class inherdemo1
{
   public static void main(String args[])
     {
        sample1 obj=new sample1(4,7,8);
      }
}
          