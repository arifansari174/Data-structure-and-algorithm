public class Main {
	public static void main(String[] args) {
		int n=408;
		int temp =n;
		int sum =0;
		while(n>0){
		    int d =n%10;
		    sum = sum +d*d*d;
		    n =n/10;
		}
		if(sum==temp){
		    System.out.println("Armsstrong Number");
		}
		else{
		    System.out.println("not armsstronng No.");
		}
	}
}