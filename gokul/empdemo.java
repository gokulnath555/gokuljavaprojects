class emp
{
   emp(String str)
    {
      System.out.println("employee name="+str);
    } 
   emp()
    {
      System.out.println("empty method");
    }
   emp(double x)
    {
      System.out.println("employee salary="+x);
    }
   emp(int y)
    {
      System.out.println("employee id="+y);
    }
}
class empdemo
{
    public static void main(String args[])
    {
      emp obj1=new emp("gokul");
      emp obj2=new emp();
      emp obj3=new emp(15000);
      emp obj4=new emp(25);
    }
}


