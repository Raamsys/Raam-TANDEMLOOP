import java.util.*;

public class OddSeriesGen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        if (n <= 2) {
            System.out.println("1");
        } else {
            int count=0;
            int limit=(n%2==0)?n-1:n;
			
            for (int i = 1; count < limit; i += 2) {
                System.out.print(i);
                count++;
                if (count < limit) {
                    System.out.print(", ");
                }
            }
        }
    }
}
