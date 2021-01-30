
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Part 1 of Labs
		
		//create a variable to hold the quantity of available plane seats left on a flight
		int availablePlaneSeats = 23;
		//create a variable to hold the cost of groceries at checkout
		double costOfGroceriesAtCheckout = 19.77;
		//create a variable to hold a person's middle initial
		char personsMiddleInitial = 'X';
		//create a variable to hold true if it's hot outside and false if it's cold outside
		boolean hotOutside = false;
		//create a variable to hold a customer's first name
		String customersFirstName = "Roger";
		//create a variable to hold a street address
		String streetAddress = "123 Circle Avenue";
		//print all variables to the console
		System.out.println(availablePlaneSeats);
		System.out.println(costOfGroceriesAtCheckout);
		System.out.println(personsMiddleInitial);
		System.out.println(hotOutside);
		System.out.println(customersFirstName);
		System.out.println(streetAddress);
		
		//Part 2 of Labs
		
		//a customer booked 2 plane seats, remove 2 seats from the available seats variable
		int availablePlaneSeats2 = availablePlaneSeats-2;
		System.out.println(availablePlaneSeats2);
		//impulse candy bar purchase, add 2.15 to the grocery total
		double costOfGroceriesAtCheckout2 = costOfGroceriesAtCheckout+2.15;
		System.out.println(costOfGroceriesAtCheckout2);
		//birth certificate was printed incorrectly, change the middle initial to something else
		char personsMiddleInitial2 = 'Y';
		System.out.println(personsMiddleInitial2);
		//the season has changed, update the hot outside variable to be opposite of what it was
		boolean hotOutside2 = true;
		System.out.println(hotOutside2);
		//create a new variable called full name using the customer's first name, the middle initial, and a last name of your choice
		String fullName = customersFirstName+" "+personsMiddleInitial+". "+"Williams";
		System.out.println(fullName);
		//print a line to the console that introduces the customer and says they live at the address variable
		System.out.println("This is "+fullName+" they live at "+streetAddress);
		
	}

}
