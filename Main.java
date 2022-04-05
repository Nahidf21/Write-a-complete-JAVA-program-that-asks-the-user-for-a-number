import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scr = new Scanner(System.in);
		Scanner scr1 = new Scanner(System.in);
		
		int number1=0;
		
		while(number1 < 10) {
			
			System.out.println("Enter the number: ");
			int number= scr.nextInt();
			if (number >= -25 && number <=25) {
				System.out.println("This number is in the range");
			}
			else if(number < -25 || number > 25) {
				System.out.println("This number is out of the range");
			}
			
			System.out.println("If you want to continue the program then Type: y or not type n : ");
			char disision = scr1.nextLine().charAt(0);
			if (disision=='n') {
				number1=10;
				System.out.println("Work done");
			}
		}
			
	}

}
