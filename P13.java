/*Write a Java Program to print Hallow pattern given below. 
Example :
input : 5
output :
* * * * * 
*     *   
*   *     
* *       
*                        */

package hallow_patterns;

import java.util.Scanner;

public class P13 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = ip.nextInt();
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= n; c++) {
				if (r + c == (n + 1) || r == 1 || c == 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}
}
