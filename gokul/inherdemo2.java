class sample1
{
     int a,b;
     sample1(int a,int b)
      {
         int sum=a+b;
         System.out.println("to add the value="+sum);
      }
}
class sample2 extends sample1
{
      sample2(int a,int b,int c)
        {
             super(b,c);
             int mul=b*c;
             System.out.println("multiplication="+mul);
        }
}

class inherdemo2
{
    public static void main(String args[])
       {
           sample2 obj=new sample2(33,7,9);
       }
}


//super keyword is used to call the base class constractor
//super keyword is used to first statement in the derived class constractor