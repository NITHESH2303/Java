import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			int n = input.nextInt();

			// for(int num=1;num<=n;num++) {
			// 	System.out.print(num+" ");
			// }

			// int num =0;
			// int max =0;
			// while( num<=n) {
			// 	System.out.print(num+" ");
			// 	num++;
				
			// }

			//System.out.println(input.nextLine());


			switch(n) {
				case 0:
				case 1:
				case 2:
				System.out.println(1);
				break;
				default:
				System.out.println(0);

			}
		}
	}
}

 