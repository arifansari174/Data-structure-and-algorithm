
		public class StarPattern {
    public static void main(String[] args) {
        int rows = 5; // number of rows

        for (int i = 1; i <= rows; i++) {
            // print stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // move to next line
            System.out.println();
        }
    

	}
}