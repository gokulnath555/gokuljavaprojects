class arith
{
  public int sum(int x,int y)
   {
    int sum=x+y;
    return sum;
   }
  public int sub(int a,int b)
   {
    int sub=a-b;
    return sub;
   }
  public int mul(int j,int k)
   {
    int mul=j*k;
    return mul;
   }
  public int div(int m,int n)
   {
    int div=m/n;
    return div;
   }
}
class arithdemo
{
  public static void main(String args[])
   {
     arith obj =new arith();
     System.out.println("sum value="+obj.sum(12,23));
     System.out.println("sub value="+obj.sub(25,20));
     System.out.println("mul value="+obj.mul(30,30));
     System.out.println("div value="+obj.div(20,5));
      
    
   }
}
