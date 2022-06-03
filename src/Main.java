import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int countOfPeople = in.nextInt(), countOfStep = in.nextInt();
        ArrayList<Integer> circle = new ArrayList<Integer>(countOfPeople);
        for (int i = 1; i <= countOfPeople; i++)
            circle.add(i);

        int step = 0, index = 0;
        while (countOfPeople > 1) {
            index = (++index) % countOfStep;
            if (index == 0) {
                countOfPeople--;
                System.out.print("Killed: ");
                System.out.println(circle.get(step));
                circle.remove(step);
            } else {
                step = (++step) % countOfPeople;
            }
        }
        System.out.println(circle.get(0));
    }
}
