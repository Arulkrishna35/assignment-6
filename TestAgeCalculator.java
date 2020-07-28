
import java.text.ParseException;
import java.util.Scanner;

public class TestAgeCalculator {

	public static void main(String[] args) throws Exception {
		AgeCalculator1 age = new AgeCalculator1();
		Scanner sc = new Scanner(System.in);
		try {
			age.calculateAge(sc.nextLine());
		} catch (ParseException e) {
			System.out.println("Date of Birth should be in dd/mm/yyyy format");
		}
	}

}