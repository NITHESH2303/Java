import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        // int num = (int)(25.369f);
        // System.out.println(num);

        // int a = 258;9\,4
        // byte b =(byte)(a);
        // System.out.println(b);

        // byte a =10;
        // byte b=20;
        // byte c=30; 
        // int d = a * b / c;
        // System.out.println(d);

        // int number = 'A';
        // System.out.println("니테시"); 
        
        byte a = 10;
        char b = 'x';
        short c = 2303;
        int d = 2003;
         float e = 14.1998f;
        double f = 0.564789;
        double result = (f*a) + (d/b) + (e*c);
        System.out.println(result);
        
    }
}
