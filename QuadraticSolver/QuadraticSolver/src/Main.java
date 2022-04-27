import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

class Main {

    public static void main(String[] args) {

        // ax2 + bx + c = 0
        String[] points = {"a","b","c"};
        List numbers_lst = new ArrayList<>(); // 3 cisla

        for (int i = 0; i < 3; i++) {

            try {
                Scanner get_number = new Scanner(System.in);
                System.out.println("Enter " + points[i] + ": ");
                int num = get_number.nextInt();
                numbers_lst.add(num);
            }
            catch (Exception e) {
                System.out.println("Error: "+e);
            }
        }
        
        Object[] obj_arr = numbers_lst.toArray();
        int[] numbers = new int[numbers_lst.size()];
        for (int j = 0; j < obj_arr.length; j++) {
            numbers[j] = (int)obj_arr[j];
        }

        int a = numbers[0];
        int b = numbers[1];
        int c = numbers[2];

        solveQuadratic(a, b, c);

    }

    static void solveQuadratic(int a, int b, int c) {

        double D = (b*b) - 4*a*c;
        if (D > 0) {

            double x1 = (~(b -1) + Math.sqrt(D)) / (2*a) ;
            double x2 = (~(b -1) - Math.sqrt(D)) / (2*a) ;
            
            System.out.println("X1: " + x1 + "\nX2: " + x2) ;
        }


        else if (D == 0) {
            System.out.println("idk im stupid");
        }
        else {
            System.out.println("No solution.");
        }

    }

}
// Very good