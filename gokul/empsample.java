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
   emp(int x)
    {
      System.out.println("my age is"+x);
    }
}
class empsample
{
     public static void main(String args[])
       {
           emp obj1=new emp("gokul");
           emp obj2=new emp();
           emp obj3=new emp(22);
       }
}