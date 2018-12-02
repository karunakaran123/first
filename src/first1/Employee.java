package first1;

import java.text.SimpleDateFormat;
import java.util.Random;
public class Employee {
	public static void main(String[] args) {
		String str="ORA";
		SimpleDateFormat dte=new SimpleDateFormat("yyyy-mm-dd");
		int rn=new Random().nextInt(1000);
		System.out.println(str+"-"+dte+"-"+rn);
		System.out.println();
	}
}