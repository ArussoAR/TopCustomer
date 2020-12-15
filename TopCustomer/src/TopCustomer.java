	import java.util.*;
	import java.util.Scanner;
	
	
public class TopCustomer {

	//Method nameOfBestCustomer()
	public String nameOfBestCustomer(ArrayList<Double> sales, ArrayList<String> customers)	{

	//variable for best
	String top = " ";

	// variable for index
	int bestIndex = 0;

	for (int a = 1; a< sales.size(); a++)
	if ((Double)sales.get(bestIndex) < (Double)sales.get(a))

	bestIndex = a;

	top = (String) customers.get(bestIndex);
	return top;
}

	public static void main(String[] args)	{

// array list for price
	ArrayList<Double> price = new ArrayList<Double>();

// array list for names
	ArrayList<String> names = new ArrayList<String>();

// scanner 
	Scanner Alex = new Scanner(System.in);

	while (true)	{
	System.out.print("Enter price: ");
	double salesPrice = Double.parseDouble(Alex.nextLine());
	
	// if price == 0 
	if (salesPrice == 0)
	break;
	System.out.print("Enter name: ");

	String cName = Alex.nextLine();

	// add price to get array
	price.add(salesPrice);
	
	// add name to get array
	names.add(cName);
	}

	
	if (names.size() == 0)	{
	System.out.println("Not a name, program ending");
	System.exit(0);
	}

	TopCustomer cust = new TopCustomer();
	System.out.println("Best customer's name " + cust.nameOfBestCustomer(price, names));
	
	}}
