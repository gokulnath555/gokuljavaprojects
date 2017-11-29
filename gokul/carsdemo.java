class cars
{
    cars(String str,String str1,String str2)
      {
        System.out.println("my car is" + str);
        System.out.println("my car is" + str1);
        System.out.println("my car is" + str2);

      }
}
class family
{
      family(String str,String str1,String str2)
      {
        System.out.println("my name is" + str);
        System.out.println("my name is" + str1);
        System.out.println("my name is" + str2);
      }
}

class carsdemo
{
     public static void main(String args[])
      {
         cars obj=new cars("audi","benz","swift");
 
         family obj1=new family("gokul","vimal","ponnuvel");
      }          

}
