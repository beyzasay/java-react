package kodlamaio.northwind.entities.concretes;





import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import lombok.Data;

//@Data // lombok veritabanı sorguları aldık
@Entity
@Table
// anatasyon bir classın çalışma ve derlme anında bilgi toplama

public class Product {
   
	 
	@Id
	@GeneratedValue
	
	@Column(name="product_id")
	private int id;
	@Column(name="categoryId")
    private int categoryId;
	
	@Column(name="productName")
    private String productName;
	
	@Column(name="unitPrice")
    private double unitPrice;
	
	@Column(name="unitsInStock")
    private short unitsInStock;
	
	@Column(name="quantityPerUnit")
    private String quantityPerUnit;
	
    public Product() {} 
    
    public Product(int id, int categoryId, String productName, double unitPrice, short unitsInStock,
			
			String quantityPerUnit) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
		this.quantityPerUnit = quantityPerUnit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public short getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(short unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public String getQuantityPerUnit() {
		return quantityPerUnit;
	}

	public void setQuantityPerUnit(String quantityPerUnit) {
		this.quantityPerUnit = quantityPerUnit;
	}
}
