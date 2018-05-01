package frame1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day4 {
@BeforeMethod
public void rockets()
{
	System.out.println("Rockets #1 seed in the west");
}
@Test
public void golden ()
{
	System.out.println("Golden state is the #2 seed in the west");
}
@Test
public void portland ()
{
	System.out.println("Golden state is the #3 seed in the west");
}
@Test(dataProvider="getData")
public void palicans (String username, String password)
{
	System.out.println("Golden state is the #4 seed in the west");
	System.out.println(username);
	System.out.println(password);
}
@DataProvider
public Object[][] getData()
{
	//!st cobinaiton- user password- good credit history
	//2nd combination user password - no credit history
	//3rd fradut history 
	
	Object[][] data= new Object[3][2];
	//!ist set
	data[0][0]="firstsetusername";
	data[0][1]="password";
	
   //2nd set
	data[1][0]="sceondsetusername";
	data[1][1]="seocrndpassword";
	
	//3rd set
	data[2][0]="thirdusername";
	data[2][1]="thirdpassword";
	return  data;
	
}
}
