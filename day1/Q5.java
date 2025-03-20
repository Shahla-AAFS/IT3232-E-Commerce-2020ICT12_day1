/* 5)Reverse the left and right numbers like
You must use only a loop
input  9
output 4 3 2 1 5 9 8 7 6

input 13
output 6 5 4 3 2 1 7 13 12 11 10 9 8

*/
import java.util.Scanner;
public class Q5 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        
        for(int i = 0; i < n; i++) {
            if(i < n/2) {
                System.out.print((n/2 - i) + " ");
            } else if(i == n/2){
                System.out.print((n/2 + 1) + " ");
            }
            else {
                System.out.print((n - (i - (n/2 +1 ))) + " ");
            }
        }
        
        scanner.close();
    }
}

/*PS E:\Academic\level 3 sem 2\EC IT3232\IT3232-E-Commerce-2020ICT12\day1>javac Q5.java
PS E:\Academic\level 3 sem 2\EC IT3232\IT3232-E-Commerce-2020ICT12\day1> java Q5      
Enter a number: 9
4 3 2 1 5 9 8 7 6  */