import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner tem1 = new Scanner(System.in);
		Scanner tem2 = new Scanner(System.in);
		Scanner tem3 = new Scanner(System.in);
    Scanner tem4 = new Scanner(System.in);

		int decision=0;
    while (decision<2){
      
      System.out.print("Enter the minimum tempereture in degrees  Celsius : ");
		  double in_tem1 =tem1.nextInt();
		  System.out.print("Enter the maximum tempereture in degrees  Celsius : ");
		  double in_tem2 =tem2.nextInt();
		  System.out.print("Enter the values of a range of temperatur : ");
		  double in_tem3 =tem3.nextInt();
		  System.out.println("° Celsius" +"			"+"° Fahrenheit");

      for (double i= in_tem1; i<= in_tem2; i=i+in_tem3 ) {
			  double f;
			  f=((9.0/5.0)*i)+32;
			  System.out.println(" "+ i+ "		=		"+f);
		}
      System.out.println("If you want to continue the program then Type: y or not type n : ");
			char disision_1 = tem4.nextLine().charAt(0);
			if (disision_1=='n') {
				decision=2;
				System.out.println("..................Work Done.................");
      }
    }
  }
}


