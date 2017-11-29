class sample
{
    public void show(int x,int y)
      {
        int tot=x*y;
        System.out.println("multiplication"+tot);
      }
    public void show1(int a,int b)
      {
          int sum=a+b;
        System.out.println("addition"+sum);
     }
   public void show2(int c,int d)
     {
          int sub=c-d;
        System.out.println("subtraction"+sub);
     }
}
class sample1 extends sample
{
     public void show(int x,int y)
       {
          int tot=x*y;
          System.out.println("multiplication"+tot);
       }
     public void show1(int a,int b)
      {
          int sum=a+b;
        System.out.println("addition"+sum);
     }
    public void show2(int c,int d)
     {
          int sub=c-d;
        System.out.println("subtraction"+sub);
     }
}
class demooverride1
{
     public static void main(String args[])
        {
       sample ref;
             sample obj=new sample();
             sample1 obj1=new sample1();
         ref=obj;
             obj.show(23,4);
         ref=obj1;
             obj1.show(23,4);
         ref=obj;
              obj.show1(13,6);
         ref=obj1;
              obj1.show1(35,7);
         ref=obj;
              obj.show2(27,9);
         ref=obj1;
              obj1.show2(90,42);
        }
}