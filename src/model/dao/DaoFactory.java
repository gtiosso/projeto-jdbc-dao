package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	// Criando uma fabrica para instanciação dos objetos DAO
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}

}
