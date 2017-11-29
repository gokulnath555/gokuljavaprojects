class employee
{
   public String name(String str)
    { 
     return str;
    }
   public int id(int x)
    {
      int id=x;
       return x;
    }
   public double salary(double y)
    {
       double salary=y;
        return y;
    }
}
class employeedemo
{
   public static void main(String args[])
     {
       employee obj=new employee();
   System.out.println("employee name is="+obj.name("gokul"));
   System.out.println("employee id is="+obj.id(25));
   System.out.println("employee salary is="+obj.salary(25000));
     }
}
   
 