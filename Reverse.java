import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        var rev = 0;
        while(n>0){
            int i = n%10;
            n/=10;
            rev = rev *10 + i;

        }
        System.out.println(rev);
    }
    
}
