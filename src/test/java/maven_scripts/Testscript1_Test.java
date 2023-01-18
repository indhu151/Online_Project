package maven_scripts;

import org.testng.annotations.Test;

public class Testscript1_Test 
{
	@Test(groups="smoke")
	public void sample1_Test()
	{
		System.out.println("Testscript1");
	}
	@Test(groups="regression")
	public void sample2_Test()
	{
		System.out.println("Testscript2");
	}

}
