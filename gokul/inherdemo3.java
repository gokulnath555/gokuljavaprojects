class sample
{
      int x,y;
      String str;
      sample(int x,int y)
       {
          int mul=x*y;
         System.out.println("multiplication="+mul);
       }
}
class sample1 extends sample
{
      sample1(String str,int x,int y)
       {
         super(x,y);
         System.out.println("employee name is="+str);
       }
}
class inherdemo3
{
      public static void main(String args[])
       {
          sample1 obj=new sample1("gokul",3,45);
       }
}
        