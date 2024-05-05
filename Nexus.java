import java.util.Scanner;
import java.util.Arrays;
class Nexus
{
	private String location;
	private String state;
	static Scanner userinputs=new Scanner(System.in);
	Product product[]={new Product("Oneplus neckband",1999.99d),
					   new Product("airpods pro 2nd gen",21199.87d),
					   new Product("galaxy watcg-5",27999.99d),
					   new Product("iwatch-8",45555.87)};
	double sum=0;
	
	Nexus(){}

	Nexus(String location,String state){
		this.location=location;
		this.state=state;
	}

	public String getLocation(){
		return location;
	}
	public String getstate(){
		return state;
	}

	public void setLocation(String NewLocation){
		location=NewLocation;
	}
	public void setState(String NewState){
		state=NewState;
	}

	/////1st display product
	public void displayProduct(){
		for (int i=0;i<product.length;i++ )
		{
			if (product[i]!=null)
			{
				System.out.println("PRODUCT NAME: "+product[i].getProductName()+" **PRODUCT PRICE: "+product[i].getPrice());
				System.out.println(" ");
			}
		} 
	}
	///////////////2nd sorting
	public void sortingArray(){
		System.out.println("filter option\n1.)Higher price range to Lower price\n\n2.)Lower Price range to Higher range");
		int filtop=userinputs.nextInt();
		Product temp;
		if (filtop==1)
		{
			for (int i=0;i<product.length;i++)
			{
				for (int j=0;j<product.length-1-i;i++ )
				{
					if (product[j].getPrice()<product[j+1].getPrice())
					{
                       temp=product[j];
					   product [j]=product [j+1];
					   product [j]=temp;
					}
				}
			}
			for (int k=0;k<product.length;k++ )
			{System.out.println("PRODUCT NAME: "+product[k].getProductName()+"------------------>"+" **PRODUCT PRICE: "+product[k].getPrice());
			 System.out.println(" ");}
					}
		if (filtop==2)
		{
			for (int i=0;i<product.length;i++)
			{
				for (int j=0;j<product.length-1-i;i++ )
				{
					if (product[j].getPrice()<product[j+1].getPrice())
					{
                       temp=product[j];
					   product [j]=product [j+1];
					   product [j]=temp;
					}
				}
			}
			for (int k=0;k<product.length;k++ )
			{System.out.println("PRODUCT NAME: "+product[k].getProductName()+"------------------>"+" **PRODUCT PRICE: "+product[k].getPrice());
			 System.out.println(" ");}
			}
		}
/////////////////3rd removing
		public void removingProduct()
	{
		System.out.println("Select the product you need to remove");
		System.out.println(" ");
		for (int i=0,m=1;i<product.length;i++,m++ )
		{
                System.out.println(m+"."+"PRODUCT NAME: "+product[i].getProductName()+"------------------>"+" **PRODUCT PRICE: "+product[i].getPrice());
		System.out.println(" ");}
		int prno=userinputs.nextInt();
		for (int j=0;j<product.length;j++ )
		{
			if (product[prno]==product[j])
			{
				product[j-1]=null;
				System.out.println("product removed succesfully");
			}
		}
		
	}
	/////////4th details of nexus
	public void DetailsOfNexus(){
		System.out.println("Nexus Location: "+location);
		System.out.println(" ");
		System.out.println("Nexus State: "+state);
	}
	public void billingOfProduct(){
		System.out.println("Select The Product You Want");
		for (int i=0,n=1;i<product.length;i++,n++)
		{
           System.out.println(n+"."+"PRODUCT NAME: "+product[i].getProductName()+"------------------>"+" **PRODUCT PRICE: "+product[i].getPrice());
		   System.out.println(" ");}
		int amountpro=userinputs.nextInt();
		boolean dorepeat=true;
		do{
		for (int j=0;j<product.length ;j++)
		{
			if (product[amountpro]==product[j])
			{
				sum+=product[j].getPrice();
				System.out.println("select \n1.)to continue adding of product\n\n2.)Exit");
				int amrep=userinputs.nextInt();
				switch (amrep)
				{
				case 1:{billingOfProduct();
				System.out.println(sum);
			    System.out.println(" ");
				break;}
				case 2: {dorepeat= false ;
				System.out.println(sum);
			    System.out.println(" ");
				break;}}
			}
			}
  
		} while (dorepeat);
			
	}
}
