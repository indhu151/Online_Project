package maven_scripts;

import org.testng.annotations.Test;

public class Testscript3_Test
{
	@Test(groups= "smoke")
	public void sample5_Test()
	{
		System.out.println("Testscript5");
	}
	@Test(groups={"smoke","regression"})
	public void sample6_Test()
	{
		System.out.println("Testscript6");
	}

}
