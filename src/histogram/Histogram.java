
package histogram;

import java.util.Scanner;

public class Histogram {

    
    public static void main(String[] args) {

        int grade = 0;
        int set1 = 0, set2 = 0, set3 = 0, set4 = 0;

        Scanner input = new Scanner(System.in);

        while (grade < 101) {

            System.out.println("Enter grade: ");
            grade = input.nextInt();

            if ((grade >= 0) && (grade <= 29)) {
                set1++;

            }

            if ((grade >= 30) && (grade <= 39)) {
                set2++;

            }

            if ((grade >= 40) && (grade <= 69)) {
                set3++;

            }

            if ((grade >= 70) && (grade <= 100)) {
                set4++;

            }

        }

        System.out.println(" ");
        System.out.println("1 - 29: " + set1);
        System.out.println("30 - 39: " + set2);
        System.out.println("40 -  69: " + set3);
        System.out.println("70 - 100: " + set4);
        System.out.println(" ");

        int star1 = 0, star2 = 0, star3 = 0, star4 = 0;

        System.out.print("0 - 29 ");
        while (star1 < set1) {
            System.out.print("*");
            star1++;

        }
        System.out.println("");

        System.out.print("30 - 39 ");
        while (star2 < set2) {
            System.out.print("*");
            star2++;
        }
        System.out.println("");

        System.out.print("40 - 69 ");
        while (star3 < set3) {
            System.out.print("*");
            star3++;
        }
        System.out.println("");

        System.out.print("70 - 100 ");
        while (star4 < set4) {
            System.out.print("*");
            star4++;
        }

        System.out.println(" ");

    }

}
