package frame1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
@Test
public void life()
{
	System.out.println("life is sucks, but still going");
}
@BeforeMethod
public void methods()
{
	System.out.println("print me every time");
}
@Parameters({"URL"})
@Test
public void james(String urlname)
{
	System.out.println("jamas is the secod in nba");
	System.out.println(urlname);
}
@Test
public void carloan()
{
	System.out.println("i pay $144 evry month");
}
@Test(groups= {"Smoke"})
public void ex()
{
	System.out.println("the new weeked albumb");
}
}
