public class Main {
	public static void main(String[] args) {
		int number = 36747;
		while(number>0){
		    int digit = number%10;
		    if (digit%2==0){
		        System.out.println(digit);
		    }
		    number =number/10;
		}
	}
}