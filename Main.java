
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 14;
		
		System.out.println(age>=16);
		age = 18;
		System.out.println(age>=16);
		
		boolean hasALicense = true;
		
		if (age >=16 && hasALicense) {
			System.out.println("You can drive!");
		} else {
				System.out.println("You can't drive!");
			}
		
		double costOfMilk = 5.00;
		int thirstLevel = 8;
		
		if (costOfMilk < 2.50 || thirstLevel>6) {
			System.out.println("Milk Please");
		}
		else System.out.println("No Thanks");
		
		
		int numberOfCookies = 250;
		int numberOfChildren = 7;
		
		if (numberOfCookies % numberOfChildren > 0) {
			System.out.println("Yes!");
		} else if (numberOfCookies % numberOfChildren >= 2) {
			System.out.println("Whoohoooo!");
		} else if (numberOfCookies % numberOfChildren >= 5) {
			System.out.println("Jackpot!");
		} else {
			System.out.println("Sad Face");
		}
	
		
		String loyaltyMemberStatus = "SILVER";
		double loyaltyMemberDiscount = 0.0;
		
		switch(loyaltyMemberStatus) {
			case "SILVER":
				loyaltyMemberDiscount = 0.1;
				break;
			case "GOLD":
				loyaltyMemberDiscount = 0.15;
				break;
			case "PLATINUM":
				loyaltyMemberDiscount = 0.25;
				break;
				
		}
		System.out.println(loyaltyMemberDiscount);
		
		
		
		double billTotal = 33.44;
		double adjustedTotal = billTotal - loyaltyMemberDiscount * billTotal;
		System.out.println(adjustedTotal);
		
		
		if (adjustedTotal > 500) {
			if (loyaltyMemberStatus == "SILVER") {
				loyaltyMemberStatus = "GOLD";
			} else if (loyaltyMemberStatus == "GOLD") {
				loyaltyMemberStatus = "PLATINUM";
			}
		}
		System.out.println(loyaltyMemberStatus);
	
		
		String username = "Ralph441";
		String password = "123";
		
		if (username == "Ralph441" && password == "123") {	
			System.out.println("login successful");
		} else {
			System.out.println("access denied");
		}
		
		for (int x = 0; x < 10; x++) {
			System.out.println(x);
		}
		
		for (int y = 10; y >= 0; y--) {
			System.out.println(y);
		}
		
		for(int z = 0; z <= 100; z+=2) {
			System.out.println(z);
		}
		
		for (int a = 0; a <= 100; a++) {
		if (a % 2 == 0) {
			System.out.println(a + " EVEN");
		} else {
			System.out.println(a + " ODD");
		}
		}
		
		int c = 100;
		while (c > 0) {
			System.out.println(c + " remainder:" + (c % 3));
			c--;
		}
		
	}
}