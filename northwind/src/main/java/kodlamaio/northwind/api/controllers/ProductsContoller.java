package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstratcs.ProductService;
import kodlamaio.northwind.entities.concretes.Product;

@RestController  //birden fazlaolabilir
@RequestMapping("/api/products")  //
public class ProductsContoller { // siteyi açmak için istek gelirse karşılayack olan yapı bu

	
	
	private ProductService productService;
	
	
	@Autowired
	public ProductsContoller(ProductService productService) {
	super();
	this.productService = productService;
}



	@GetMapping("/getall") // siteden istekte bulunursam bunu bu çalışır 
  public List<Product>  getAll() {
	return this.productService.getAll();
	
		
}
	
}
