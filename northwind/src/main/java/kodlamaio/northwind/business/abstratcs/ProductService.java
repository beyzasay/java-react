package kodlamaio.northwind.business.abstratcs;

import java.util.List;

import kodlamaio.northwind.entities.concretes.Product;

public interface ProductService {

	//controllerı kullanacağı servislerin yzıldığı iş katmanı
	//ürünü eklerken olması geeken kurallar
	List<Product> getAll();
}
