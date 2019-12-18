package yhw;

import java.lang.invoke.SwitchPoint;

import javax.sql.rowset.CachedRowSet;
import javax.swing.SwingConstants;

public class E07 {

	public static void main(String[] args) {
		int age=17;
		if(age<12) {
			System.out.println("此人是儿童");	
		}
		else if(age<18){
		    System.out.println("此人未成年");
		}
		
		
		/////////////////////////////
		int month=12;
		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("大约在冬季"); 
		    break;

		case 3:
		case 4:
		case 5:
			System.out.println("大约在春季"); 
			break;

		case 6:
		case 7:
		case 8:
			System.out.println("大约在夏季"); 
			break;

		case 9:
		case 10:
		case 11:
			System.out.println("大约在秋季"); 
			break;
			default:
			break;
		}
	}
}

