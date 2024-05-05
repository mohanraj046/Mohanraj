class Product
{
	private String productName;
	private double price;

	Product(){}
	Product(String productName,double price)
	{
		this.productName=productName;
		this.price=price;
	}

	public String getProductName(){
		return productName;
	}
	public double getPrice(){
		return price;
	}

	public void DetailsOfProduct()
	{
		System.out.println("Product Name: "+" "+productName);
		System.out.println("Product price: "+" "+price);
	}


}