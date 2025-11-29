public class fibonacciseries {
	public static void main(String[] args) {
		int a=0;
		int b =1;
		int count =1;
		while(count<=10){
		    int c=a+b;
		    System.out.println(c);
		    a=b;
		    b=c;
		    count++;
		}
	}
}
