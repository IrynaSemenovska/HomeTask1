
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

//Task5

public class ArrayMadness1 {
    public static void main(String[] args) {
        Set<Integer> list = new HashSet<>();

        System.out.println("Please, enter the set of numbers:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for (int i = 1; i < 100; i++) {
            int length = s.length();
            if (length <= 3) {
                System.out.println("The count of numbers should be greater then 3. Please, enter again:");
                s = scanner.nextLine();
            } else {
                StringTokenizer stk = new StringTokenizer(s,"[, ]");
                while (stk.hasMoreTokens()) {
                    String symbol = stk.nextToken();
                    list.add(Integer.parseInt(symbol));
                }
                System.out.println(list);
                break;
            }
        }
    }
}

