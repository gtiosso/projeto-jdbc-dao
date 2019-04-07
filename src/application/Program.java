package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		// Instanciando o JDBC DAO, sem precisar declarar o mesmo diretamente no
		// programa utilizando Injeção de dependência.
		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== TEST 1: Seller findById ===");
		Seller seller = sellerDao.findById(9);
		System.out.println(seller);

		System.out.println();
		
		System.out.println("=== TEST 2: Seller findByDepartment ===");
		Department department = new Department(1, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller item : list) {
			System.out.println(item);
		}
		
		System.out.println();
		
		System.out.println("=== TEST 3: Seller findAll ===");
		List<Seller> listAll = sellerDao.findAll();
		for (Seller item : listAll) {
			System.out.println(item);
		}
		
		System.out.println();
		
		System.out.println("=== TEST 4: Seller insert ===");
		Seller obj = new Seller(null, "Isabella Santos", "isabella@gmail.com", sdf.parse("10/01/2018"), 15000.0, new Department(4, null));
		sellerDao.insert(obj);
		System.out.println("Inserted! New id = " + obj.getId());
		
		System.out.println();
		
		System.out.println("=== TEST 5: Seller update ===");
		seller = sellerDao.findById(2);
		seller.setName("Tomas Brownn");
		sellerDao.update(seller);
		System.out.println("Updated ! - New data = " + seller);
		
		System.out.println();
		
		//System.out.println("=== TEST 6: Seller deleteById ===");
		//sellerDao.deleteById(5);

		
	}

}
