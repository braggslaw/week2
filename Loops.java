
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2a b and c - create boolean and give value
				boolean isHotOutside = false;
				boolean isWeekday = false;
				boolean hasMoneyInPocket = true;
		// 3a b and c - create variables
				double costOfMilk = 2.99;
				double moneyInWallet = 20;
				int thirstLevel = 7;
//4a b c and d - create variables for scenarios
				boolean shouldByIcecream = isHotOutside && hasMoneyInPocket;
				boolean willGoSwimming = isHotOutside && isWeekday;
				boolean isAGoodDay = isHotOutside && hasMoneyInPocket && isWeekday;
				boolean willBuyMilk = isHotOutside && hasMoneyInPocket;
				
				System.out.println(shouldByIcecream);
				System.out.println(willGoSwimming);
				System.out.println(isAGoodDay);
				System.out.println(willBuyMilk);
//5.	Create a new class called Loops. In the main method of this class, create the following loops with any variables you feel are needed:
//a.	A while loop that prints all even numbers from 0 to 100
				int counter = 1;
				while (counter <= 100) {
					if(counter % 2 == 0) {
						System.out.println(counter);
					}
					counter++;
				}		
//b.	A while loop that prints every 3rd number going backwards from 100 until we reach 0
				int counter2 = 100;
				while (counter2 >=0) {
					
					System.out.println(counter2);
					
					counter2 = counter2 - 3;
				}		
//c.	A for loop that prints every other number from 1 to 100
				for(int i = 1; i <= 100; i++) {
					if(i % 2 == 0) {
						System.out.println(i);
					}
				}
	//d.	A for loop that prints every number from 0 to 100, but if the number is divisible by 3, 
				//it prints “Hello” instead of the number, 
				//and if the number is divisible by 5, 
				//it prints “World” instead of the number, and if it is divisible by both 3 and 5, 
				//it prints “HelloWorld” instead of the number.
				for(int n = 0; n <= 100; n++) {
						//is it both?			
					if(n % 3 == 0 && n % 5 == 0) {
						System.out.println(n + " Hello World");
						//skip
						n++;					
					}
					//is it either or /3 or /5?			
					if(n % 3 == 0 || n % 5 == 0) {
						if(n % 3 == 0) {
							System.out.println(n + " Hello");
							n++;
						}
						if(n % 5 == 0) {
							System.out.println(n + " World");
							n++;
							}
					}
									
					if(n % 3 != 0 || n % 5 != 0) {
						System.out.println(n + " Just another number");
					}
				}			
	}
}
