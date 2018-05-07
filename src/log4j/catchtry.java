package log4j;

public class catchtry {

	public static void main(String[] args) {
		int[]xy= {21,2321};
		
		try {
int grandtotal=xy[1]+xy[3];
System.out.println(grandtotal);
		}catch(Exception l) {
			System.out.println("erro :" +l);
		}
		System.out.println("more dogss");
	}


}
