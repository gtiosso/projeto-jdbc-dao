package model.dao;

import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;
import model.services.DB;

public class DaoFactory {
	
	// Criando uma fabrica para instanciação dos objetos DAO
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}

	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
