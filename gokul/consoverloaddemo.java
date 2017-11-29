class consoverload
{
      consoverload(int a)
        {
          System.out.println("roll no is="+a);
        }
      consoverload(String str)
        {
          System.out.println("my name is="+str);
        }
      consoverload()
        {
          System.out.println("empty method");
        }
      consoverload(double salary)
        {
          System.out.println("emp salary is="+salary);
        }    
}
class consoverloaddemo
{
      public static void main(String args[])
        {
             consoverload obj=new consoverload(23);
             consoverload obj1=new consoverload("gokul nath");
             consoverload obj2=new consoverload();
             consoverload obj3=new consoverload(15000);
             
        }
}