class inhermethod1
{
     int age;
     String name;
    inhermethod1(int age,String name)
      {
         System.out.println("employee age is"+age);
         System.out.println("employee name is"+name);
       }
}
class inhermethod2 extends inhermethod1
{
     inhermethod2(int age,String name)
        {
          System.out.println("student age is"+age);
         System.out.println("student name is"+name);
        }
}
class inhermethod
{
     public static void main(String args[])
        {
            inhermethod1 obj=new inhermethod1(22,"gokul");
              
         }
}