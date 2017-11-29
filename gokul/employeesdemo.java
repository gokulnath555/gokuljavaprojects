class employees
{
  public void display(String str)
   {
    return str;
   }
  public void display(int a)
   {
     int employees=a;
      return a;
   }
  public void display(double salary)
   {
      return salary;
   }
}
class employeesdemo
{
   public static void main(String args[])
    {
     employees obj=new employees();
     

     System.out.println("employees name is="+obj.display("gokul"));
     System.out.println("employees rollno is="+obj.display(20));
     System.out.println("employees salary is="+obj.display(15000));
     
    }
} 