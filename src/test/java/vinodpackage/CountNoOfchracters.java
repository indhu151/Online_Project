package vinodpackage;

public class CountNoOfchracters {

	public static void main(String[] args) {

		
		  String s="Vinnoood";
		    
		  
		char[] ch = s.toCharArray();
		 
		
		int count[]=new int[s.length()];
		int k;
		for(int i=0;i<ch.length;i++)
		{
			 count[k]=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
				  count[k]++;
				}
				
			}
			
			
			System.out.println(ch[i]+" "+count);	
		     
			
		}
		
		
	}

}
