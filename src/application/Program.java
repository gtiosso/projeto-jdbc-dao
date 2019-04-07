package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Department department = new Department(1, "Books");
		
		Seller obj = new Seller(1, "Guilherme", "guilherme.tiosso", sdf.parse("26/06/1992"), 2000.0, department);
		
		
		System.out.println(obj);
	}

}
