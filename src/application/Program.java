package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		// Instanciando o JDBC DAO, sem precisar declarar o mesmo diretamente no programa
		// Injeção de dependência.
		SellerDao sellerDao = DaoFactory.createSellerDao();

		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
	}

}
