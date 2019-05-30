import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter number of discs: ");
        Scanner scanner = new Scanner(System.in);
        int discs = scanner.nextInt();
        solve(discs, "A", "B", "C");
    }

    public static void solve(int numRings, String start, String auxiliary, String end) {
        // Check if rings = 1, print out moving the ring from start -> end
        if (numRings == 1) {
            System.out.println(start + " -> " + end);
        } else { //else recursion happens
            //here we are moving one ring less from the starting pole to the aux pole
            solve(numRings - 1, start, end, auxiliary);
            //print out moving the ring from start -> end
            System.out.println(start + " -> " + end);
            //remaining ring in aux moves to end, then recurse
            solve(numRings - 1, auxiliary, start, end);
        }
    }
}

