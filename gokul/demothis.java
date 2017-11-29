class sample
{
    int x;
    String str;
    int y;
     public void show(int x,String str)
       {
         this.x=x;
         this.str=str;
        System.out.println("num is"+x);
       System.out.println("name is"+str);
       }
     public void display(int y)
       {
          this.y=y;
          System.out.println("num is"+y);
        }
   
}
class demothis
{
   public static void main(String args[])
      {
         sample obj=new sample();
           obj.show(23,"gokul");
           obj.display(25);
       }
}