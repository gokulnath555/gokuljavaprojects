class democlone implements Cloneable
{
	String name;
	int rollno;
		
		democlone(String name,int rollno)
		{
			this.name=name;
			this.rollno=rollno;
		
		}
	
		public Object clone()throws CloneNotSupportedException
		{
			return super.clone();
		}
	
		public static void main(String args[])
		{
			try{
			
				democlone s1=new democlone("gokul",1);
				democlone s2=(democlone)s1.clone();
				democlone s3=new democlone("santhosh",2);
				
				
				System.out.println(s1.name+""+s1.rollno);
				System.out.println(s2.name+""+s2.rollno);
				System.out.println(s3.name+""+s3.rollno);
			}catch(CloneNotSupportedException c){}


		}


}




