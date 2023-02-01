import java.util.*;

public class CaseCheck {

    public static void main(String[] args) throws Exception{
        // Scanner input = new Scanner(System.in);
        // char ch = input.next().trim().charAt(0);

        // if( ch >='a' && ch <='z' ) {
        //     System.out.println("LowerCase: " + ch);
        // }
        // else {
        //     System.out.println("UpperCase: " + ch);
        // } '
            Scanner inp = new Scanner(System.in);
            int n = inp.nextInt();
            
        

            while(n>0){
                Scanner in = new Scanner(System.in);
                int N = in.nextInt();
                int C1 = in.nextInt();
                int C2 = in.nextInt();

                int min = 1000000;
                int i = 0;
                while(i<=N){
                    int K = price(C1,i);
                    int L = price(C2 , N-i);
                    int pay = K+ L;
                    min = mini(pay,min);
                    i++;
                }
                System.out.println(min);
            }
    }
    static int price(int c , int i){
        return (c *(int)(Math.pow(i,2)));
    }
    static int mini(int pay ,int min){
        if(min>pay)
            return pay;
        return min;
    }
}
