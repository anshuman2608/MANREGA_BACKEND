package ui;

import java.time.LocalDate;
import java.util.Scanner;

import dto.ProjectDTO;
import dto.ProjectDTOImpl;

public class BDOUI {
	static void addProjectUI(Scanner sc) {
		System.out.print("Enter  proj_id");
		String proj_id = sc.next();
		System.out.print("Enter panchayat_code ");
		String panchayat_code = sc.next();
		System.out.print("Enter start_date");
		LocalDate start_date = LocalDate.parse(sc.next());
		System.out.print("Enter end_date");
		LocalDate end_date = LocalDate.parse(sc.next());
		System.out.print("Enter NoOfWorker");
		int NoOfWorker =sc.nextInt();
		System.out.print("Enter per_day_wages");
		double per_day_wages=sc.nextDouble();
		System.out.print("Enter boolean assigned or not");
		boolean assigned=sc.nextBoolean();
		//stuff data to DTO
		ProjectDTO proj = new ProjectDTOImpl(proj_id, panchayat_code,start_date,end_date,NoOfWorker,per_day_wages,assigned);
		
		CategoryDAO catDAO = new CategoryDAOImpl();
		try {
			catDAO.addCategory(category);
			System.out.println("Category added successfully");			
		}catch(SomethingWentWrongException ex) {
			System.out.println(ex);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
