package vinodpackage;

public class CountNoOfchracters {

	public static void main(String[] args) {

		
		  String s="Vinnoood";
		    
		  
		char[] ch = s.toCharArray();
		 int count =1;
		
		for(int i=0;i<ch.length;i++)
		{
			 int j=0;
			for(j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
				
			}
			
			
			System.out.println(ch[i]+" "+count);	
		     
			
		}
		
		
	}

}
