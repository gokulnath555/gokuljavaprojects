class consdemo1
{
       
     consdemo1(int a,int b)
      {
         int add=a+b;
        System.out.println("to add the value"+add);
       }
     consdemo1( String str)
       {
         
        System.out.println("emp name is"+str);
        }
     consdemo1(double salary)
        {
           System.out.println("emp salary"+salary);
        }
     consdemo1(int x)
       {
           System.out.println("emp age is"+x);
       }

}
class consdemo4
{
    public static void main(String args[])
      {
          consdemo1 obj=new consdemo1(22,3);
          consdemo1 obj1=new consdemo1("gokul");
          consdemo1 obj2=new consdemo1(35000);
          consdemo1 obj3=new consdemo1(22);
          
   
      }
}