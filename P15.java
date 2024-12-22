/*Write a Java Program to print Number pattern given below. 
Example :
input : 5
output :
1 2 3 4 5 
  1 2 3 4 
    1 2 3 
      1 2 
        1                    */

package hallow_patterns;

import java.util.Scanner;

public class P15 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = ip.nextInt();
		for (int r = 1; r <= n; r++) {
			int s = 1;
			for (int c = 1; c <= n; c++) {
				if (c >= r) {
					System.out.print(s + " ");
					s++;
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}
}
