import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Read the integer N
            int n = scanner.nextInt();

            // Create a LinkedList of Integers
            LinkedList<Integer> list = new LinkedList<>();

            // Read N integers and add them to the LinkedList
            for (int i = 0; i < n; i++) {
                list.add(scanner.nextInt());
            }

            // Create a ListIterator for the LinkedList
            ListIterator<Integer> iterator = list.listIterator();

            // Traverse the list in the forward direction and print the elements
            System.out.print("Forward:");
            while (iterator.hasNext()) {
                System.out.print(" " + iterator.next());
            }
            System.out.println();

            // Traverse the list in the backward direction and print the elements
            System.out.print("Backward:");
            while (iterator.hasPrevious()) {
                System.out.print(" " + iterator.previous());
            }
            System.out.println();
        }
    }
}
