package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		// Instanciando o JDBC DAO, sem precisar declarar o mesmo diretamente no
		// programa utilizando Injeção de dependência.
		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== TEST 1: Seller findById ===");
		Seller seller = sellerDao.findById(8);
		System.out.println(seller);
		
		System.out.println("=== TEST 2: Seller deleteById ===");
		sellerDao.deleteById(8);
		System.out.println(seller);
	}

}
