public class Main {
	public static void main(String[] args) {
		int n=5432;
		int sum =0;
		while(n>0){
		    int digit = n%10;
		    if(digit%2==0){
		        sum = sum + digit;
		    }
		    n=n/10;
		}
		System.out.println(sum);
	
	}
}