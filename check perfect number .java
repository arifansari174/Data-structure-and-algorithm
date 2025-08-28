public class checkNumberIsPerfectOrNot{
	public static int perfect(int n) {
		int sum = 0;
		for(int i=1; i<n; i++){
		    if(n%i==0){
		        sum = sum+i;
		    }
		}
		return sum;
	}
	public static void main(String[]args){
	    int n= 28;
	    int res = perfect (n);
	    if(res==n){
	        System.out.println("number is erfect");
	    }
	    else{
	        System.out.println("number is not perfect");
	    }
	}
}