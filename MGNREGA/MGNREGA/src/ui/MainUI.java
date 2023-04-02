package ui;

import java.util.Scanner;

public class MainUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//user CategoryUI, ProductUI, OrderUI and UserUI class here  
		int choice = 0;
		do {
			System.out.println("1. Admin Login\n2. User Login\n3. User Sign Up\n0. Exit");
			choice = sc.nextInt();
			switch(choice) {
				case 0:
					System.out.println("Thank you, Visit again");
					break;
				case 1:
					//adminLogin(sc);
					break;
				case 2:
					//userLogin(sc);
					break;
				case 3:
					//userUI.signup(sc);
					break;
				default:
					System.out.println("Invalid Selection, try again");
			}
		}while(choice != 0);
		sc.close();

	}

}
