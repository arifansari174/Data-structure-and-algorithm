public class strongNumber {
	public static void main(String[] args) {
		int n =145;
		int temp= n;
		int sum = 0;
		while(n>0){
		    int rev =n%10;
		    int fact =1;
		    for(int i=1; i<=rev; i++){
		        fact =fact*i;
		    }
		    sum =sum+fact;
		    n =n/10;
		}
		if(temp==sum){
		    System.out.println("Number is strong");
		}
		else{
		     System.out.println("Not strong");
		}
	}
}