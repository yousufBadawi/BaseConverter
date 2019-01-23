import java.util.Scanner;

public class UserInput {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the original base. It must be between 2 and 36");
		
		int base1= sc.nextInt();
		while(base1 > 36 || base1 < 2){
			System.out.println("Error! Please enter a valid value for the base");
			base1= sc.nextInt();
		}
		sc.reset();
		
		System.out.println("Please enter the number which you wish to convert.");
		
		boolean succesfulInput = false;
		String num1 = sc.nextLine();
		while(!succesfulInput){
			num1 = sc.nextLine();
			succesfulInput = true;
			for(int i = 0; i < num1.length(); i++){
				if(num1.charAt(i) > 9){
					if(num1.charAt(i)>((base1-9) + 'A')){
						System.out.println("The number that you wished to enter is invalid. Try again.");
						succesfulInput = false;
						break;
					}
				}
			}
		}
                System.out.println("Nogger");
		System.out.println("Please enter the conversion base. It must be between 2 and 36");
		int base2= sc.nextInt();
		while(base2 > 37 || base2 < 2){
			System.out.println("Error! Please enter a valid value for the base");
			base2= sc.nextInt();
		}
		
		BaseChanger bc = new BaseChanger(base1, base2, num1);
		String num2 = bc.baseChange();
		System.out.println("It has been converted to " + num2 + ".");
		
	}
}
