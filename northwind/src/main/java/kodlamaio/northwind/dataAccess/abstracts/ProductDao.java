package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer> { 
	
	//jpa verdiğin veri tipi için entitiy için priavte alanı ver
//jpa repositoy her nesen için çalışablecek yapıya sahip
	
	
}
