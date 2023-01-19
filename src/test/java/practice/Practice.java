package practice;

public class Practice {

	public static void main(String[] args) {
			{

				int a[]= {12,24,10,50,62};
				int res=a[0];
				for(int i=0;i<4;i++)
				{
					if(res<a[i])
					{
						res=a[i];
					}
				}
				System.out.println(res);
	}

	}
}
