import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;
        while(n>0) {
            int i=n%10;
            count += i;
            n=n/10;
        }
        System.out.println(count);
    }
}
