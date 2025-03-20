//4)print the odd numbers between 1 to 20
public class Q4 {
    public static void main(String[] args)
     {
        for(int i = 1; i <= 20; i++) 
        {
            if(i % 2 != 0)
             {
                System.out.println(i);
            }
        }       
    }
}
/*PS E:\Academic\level 3 sem 2\EC IT3232\IT3232-E-Commerce-2020ICT12\day1> javac Q4.java
PS E:\Academic\level 3 sem 2\EC IT3232\IT3232-E-Commerce-2020ICT12\day1> java Q4      
1
3
5
7
9
11
13
15
17
19 */