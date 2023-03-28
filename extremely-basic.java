// Your First Program
import java.util.Scanner;
class extremely-basic {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);




        int x = input.nextInt();
        int y = input.nextInt();

        System.out.println("X = " + (x+y));

        // closes the scanner
        input.close();
    }
}
