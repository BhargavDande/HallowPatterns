/*Write a Java Program to print Number pattern given below. 
Example :
input : 3
output :
1 4 7 
2 5 8 
3 6 9                    */

package hallow_patterns;

import java.util.Scanner;

public class P16 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = ip.nextInt();
		int i = 1;
		for (int r = 1; r <= n; r++) {
			int s = i;
			for (int c = 1; c <= n; c++) {
				System.out.print(s + " ");
				s = s + n;
			}
			System.out.println();
			i++;
		}

	}
}
