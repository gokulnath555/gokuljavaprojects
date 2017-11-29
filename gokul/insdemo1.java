class insdemo
{
      int x,y;
      String name;
      insdemo(int a,int b)
      {
        int x=a;
        int y=b;
        int sum=a+b;
       System.out.println("to add the value"+sum);
      }
}
class insdemos2 extends insdemo
{
     insdemos2(String name,int a,int b )
      {
          super(a,b);
    System.out.println("my name is"+name);
      }
}
class insdemo1
{
    public static void main(String args[])
      {
        insdemos2 obj=new insdemos2("gokul",45,55);
      }
}
 
 