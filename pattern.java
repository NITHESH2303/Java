import java.util.*;

public class pattern {
    public static void main(String[] args) {
        pattern6(1,0);

    }

    static void pattern1(int n){
        for (int i = 1; i <=2*n-1; i++) {
            int colinrow = i > n ? 2*n-i : i;
                for (int j = 1; j <=colinrow; j++) {
                    System.out.print(j +" ");
                }
            
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int i = 1; i <=2*n-1; i++) {
            int colinrow = i > n ? 2*n-i : i;
            int space = n -colinrow;
            for (int s =0 ; s < space; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=colinrow; j++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int i = 1; i <=n; i++) {
            for (int space =0 ; space < n-i; space++) {
                System.out.print(" ");
            }
            for (int j = i; j >=1; j--) {
                System.out.print(j+"");
            }
            for(int  j = 2; j <=i; j++) {
                System.out.print(j+"");
            }
            
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int i = 1; i <=n; i++) {
                for(int space = 0; space < n-i; space++) {
                    System.out.print(" ");
                }
                for (int j = i; j >=1; j--) {
                    System.out.print(j);
                }
                for(int  j = 2; j <=i; j++) {
                    System.out.print(j);
                }          
            System.out.println();
        }
    }
    static void pattern5(int r,int c){
        if(c==0){
            return;
        }
        if(r<c){
            System.out.print("*");
            pattern5(r+1,c);
        }else{
            System.out.println();
            pattern5(0,c-1);
        }
    }
    static void pattern6(int r,int c){
        if(r==6){
            return;
        }
        if(r>c){
            System.out.print("*");
            pattern6(r,c+1);
        }else{
            System.out.println();
            pattern6(r+1,0);
        }
    }
}
