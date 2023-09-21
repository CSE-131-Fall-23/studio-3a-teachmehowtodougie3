package studio3;
import java.util.Scanner;
public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Which number do you want to use? ");
		int n = in.nextInt();
		boolean[] list = new boolean[n + 1];
		for(int i = 2; i < list.length ; i++) {
			list[i] = true;
		}
		for(int i = 2; i <= Math.sqrt(n); i++ ) {
			if(list[i] == true) {
				for(int j = (i*i); j<=n; j+=i) {
					list[j] = false; 
					}
		}
			}
		for(int k =2; k < list.length; k++) {
			if(list[k] == true) {
				System.out.print(" " + k);
			}
		}
	}
}



	


