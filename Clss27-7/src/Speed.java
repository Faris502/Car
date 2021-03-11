import java.util.Scanner;
public class Speed {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		
		
		
		System.out.println("your name is:");
		String name = input.toString();
		
		
		System.out.println("your speed is:");
		double speed = input.nextDouble();
		
		
		System.out.println("the top speed is:");
		double topSpeed = input.nextDouble();
		
		
		System.out.println("the top speed in MPH");
		double topSpeedMPH = input.nextDouble();
		
	}
}
