import java.util.Scanner;
class NexusDrive 
{   
	static Scanner select=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{   Nexus nexus=new Nexus("Chennai","tamilnadu");
		System.out.println("WLCOME TO THE NEXUS APPLICATION"); 
		System.out.println(" ");
		boolean repetation=true;
			do{
				System.out.println("1.)Disply The Details Of Products\n\n2.)Filter Option Based On Price\n\n3.)Removing Product\n\n4.)Details of Nexus\n\n5.)Total Amount Of Product You Selected\n\n6.)exit");
		        int selectedoption=select.nextInt();
				switch (selectedoption)
		    {
               case 1: {System.out.println("Please Wait A Second");
			         Thread.sleep(1000);
				       nexus.displayProduct();
					   Thread.sleep(1000);
					   System.out.println(" ");
					   System.out.println("Going Back To HomePage");
					   System.out.println(" ");
					   Thread.sleep(500);
					   break;}
			  case 2: {nexus.sortingArray();
					   Thread.sleep(1000);
					   System.out.println("Going Back To HomePage");
					   System.out.println(" ");
					   Thread.sleep(500);
			           break;}
			  case 3:{nexus.removingProduct();
			           Thread.sleep(1000);
					   System.out.println("Going Back To HomePage");
					   System.out.println(" ");
					   Thread.sleep(500);
					  break;}
			  case 4:{nexus.DetailsOfNexus();
			           Thread.sleep(1000);
					   System.out.println("Going Back To HomePage");
					   System.out.println(" ");
					   Thread.sleep(500);
			           break;}
			  case 5:{ nexus.billingOfProduct();
			           Thread.sleep(1000);
					   System.out.println("Going Back To HomePage");
					   System.out.println(" ");
					   Thread.sleep(500); 
				       break;}
			  case 6:{repetation=false;
			            System.out.println("THANK YOU SO MUCH");}
			}	
		}while (repetation);
	}
}
