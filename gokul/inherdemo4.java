class sample
{
         String name;
         String city;
         String state;
         int a;
         sample(String city,String state)
          {
            System.out.println("city is"+city);
            System.out.println("state is"+state);
          }
}
class sample1 extends sample
{
         sample1(String name,String city,String state,int a)
          {
              super(city,state);
              System.out.println("emp name is"+name);
              System.out.println("city is"+city);
              System.out.println("state is"+state);
              System.out.println("emp age is"+a);
          }
}
class inherdemo4
{
       public static void main(String args[])
       {
           sample1 obj=new sample1("gokul","salem","tamilnadu",22);
       }
} 