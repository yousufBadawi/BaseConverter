
public class BaseChanger {
	int base1;
	int base2;
	String num;
	String result = "";
	int numA;
	int numB;
	int modB;
	char charB;
	int res1; //intermediate base 10 number;
	public BaseChanger(int base1, int base2, String num){
		this.base1 = base1;
		this.base2 = base2;
		this.num = num;
	}
	public String baseChange(){
		for(int i = 0; i < num.length(); i++){
			if(num.charAt(num.length()-1-i) >= 'A'){ //Not a regular integer;
				numA = (num.charAt(num.length()-i-1)-'A'+10);
			} else {
				numA = num.charAt(num.length()-i-1)-'0';
			}
			res1 += (Math.pow(base1, i))*numA;
		} //By the end I should have the base 10 equivalent of this number
		numB = res1; //init to res1
		while(true){
			modB = numB%base2;
			numB = numB/base2;
			if(modB > 9){
				charB = (char)('A'+ modB);
			} else {
				charB = (char)('0'+ modB);
			}
			result = charB + result;
			if(numB == 0) break;
		}
		return result;
	}
}
