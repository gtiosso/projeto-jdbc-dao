package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

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
		Seller seller = sellerDao.findById(8);
		System.out.println(seller);
		
		System.out.println();
		
		System.out.println("=== TEST 2: Seller deleteById ===");
		sellerDao.deleteById(8);
		System.out.println(seller);

		System.out.println();
		
		System.out.println("=== TEST 3: Seller insert ===");
		Seller obj = new Seller(1, "Guilherme Tiosso", "guilherme.tiosso@gmail.com", sdf.parse("26/06/1992"), 12000.0, new Department(1, "'1', 'Computers"));
		sellerDao.insert(obj);
		System.out.println(seller);

		
	}

}
