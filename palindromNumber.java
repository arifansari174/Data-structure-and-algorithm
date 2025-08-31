public class palindromNumber {
	public static void main(String[] args) {
	
	 int n=121;
	 int temp=n;
	 int reverse =0;
	 while(n!=0){
	     int d =n%10;
	     reverse =reverse*10+d;
	     n =n/10;
	 }
	 if(reverse==temp){
	     System.out.println("palindrom Number");
	 }
	 else{
	     System.out.println("Not palindrom no.");
	 }
	}
}