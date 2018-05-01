package frame1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

@BeforeTest
public void schoolloan()
{
	System.out.println("200 plus");
}
@AfterSuite
public void rent()
{
	System.out.println("im the last one");
}

@Test
public void houseloan ()
{
	System.out.println("NBA playoffs kick off next week");
}
}
