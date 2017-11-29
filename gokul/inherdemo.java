class student
{
     int id;
     String name;
     public void getstudent(int id,String name)
        {
           this.id=id;
           this.name=name;
           System.out.println("student id is"+id);
           System.out.println("name of the student"+name);
        }
     public void stu()
        {
           System.out.println("student id is"+id);
           System.out.println("name of the student"+name);
        }
}

class staff extends student
{
     public void display()
       {
          System.out.println("staff name is"+name);
       }
}
class emp extends staff
{
      public void emp()
          {
            System.out.println("emp name is"+name);
          }
}
class inherdemo
       {
     public static void main(String args[])
       {
         emp obj=new emp();
         obj.getstudent(22,"gokulnath");
         obj.stu();
         obj.display();
         obj.emp();
         
       }
}