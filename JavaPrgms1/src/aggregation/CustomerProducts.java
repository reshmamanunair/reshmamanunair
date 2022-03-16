package aggregation;

public class CustomerProducts {
	float product1,product2,product3,product4,product5,sum;
	CustomerDetails obj;
	
public void product(float product11,float product22,float product33,float product44,float product55,CustomerDetails objj) {
	this.product1=product11;
	this.product2=product22;
	this.product3=product33;
	this.product4=product44;
	this.product5=product55;
	this.obj=objj;
}
public void addProducts() {
	
	sum=product1+product2+product3+product4+product5;
	System.out.println("The sum of the products are " +sum);
}
public void discount()
{
	
	float dis=(sum*10)/100;
	float amntafterdis=sum-dis;
	
	if(sum>20000) 
	{
	System.out.println("The person is eligible for discount");
	System.out.println("The discount is " +dis);
	System.out.println("The final amount after discount is " +amntafterdis);
		
	}
	else
	{
		System.out.println("The person is not eligible for discount");
	}
	System.out.println("*****************");
}
	public void display()
	{
		System.out.println("The name of the customer is "+obj.name);
		System.out.println("The purchase date is: " + obj.date);
		System.out.println("The customer ID is: "  + obj.id);
		System.out.println("The customer phone number is :" +obj.phone);
		System.out.println("The price of product 1 is :" +product1);
		System.out.println("The price of product 2 is :" +product2);
		System.out.println("The price of product 3 is :" +product3);
		System.out.println("The price of product 4 is :" +product4);
		System.out.println("The price of product 5 is :" +product5);
		
		
		
		
	}


	public static void main(String[] args) {
		
		CustomerDetails obj1=new CustomerDetails();
		obj1.details("nila","11june2021",123,25369754);
		CustomerProducts obj4=new CustomerProducts();
		obj4.product(5000.2f,5000.3f,5000.5f,6000.8f,7000.4f,obj1);
		obj4.display();
		obj4.addProducts();
		obj4.discount();
		
		
		CustomerDetails obj2=new CustomerDetails();
		obj2.details("lila","17july2021",323,45369754);
		CustomerProducts obj5=new CustomerProducts();
		obj5.product(5000.52f,8000.12f,9000.4f,5000.8f,9000.4f,obj2);
		obj5.display();
		obj5.addProducts();
		obj5.discount();
		
		
		CustomerDetails obj3=new CustomerDetails();
		obj3.details("bila","13august2021",175,55569754);
		CustomerProducts obj6=new CustomerProducts();
		obj6.product(500.12f,500.3f,500.54f,500.11f,500.4f,obj3);
		obj6.display();
		obj6.addProducts();
		obj6.discount();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
