package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstratcs.ProductService;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

// somut sınıfımı productmanager asıl işi yaptığımız yer 
@Service // bu yer servis katmanı görevini görecejk
public class ProductManager implements ProductService{

	private ProductDao productDao;
	
	@Autowired // spring arkaplanda projede buna karşılıkgelebilecek  projede
	                 //productdaonun ınstance ı bi tane sınıf üretip veriyor
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}


	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return this.productDao.findAll();
	}

}
