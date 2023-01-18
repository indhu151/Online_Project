package maven_scripts;

import org.testng.annotations.Test;

public class Testscript2_Test 
{
	@Test(groups= {"smoke","regression"})
	public void sample3_Test()
	{
		System.out.println("Testscript3");
	}
	@Test(groups="regression")
	public void sample4_Test()
	{
		System.out.println("Testscript4");
	}

}
