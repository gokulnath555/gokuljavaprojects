class Employee
{
    public String name(String str)
      {
        return str;
      }
    public int rollno(int x)
      {
         int rollno=x;
         return rollno;
      }
    public double salary(double salary)
      {
         return salary;
      }
}
class Employeereturn
{
   public static void main (String args[])
     {
        Employee obj=new Employee();
        System.out.println("emp name is="+obj.name("gokul"));
        System.out.println("emp rollno is="+obj.rollno(20));
        System.out.println("emp salary is="+obj.salary(15000));
     }
}








