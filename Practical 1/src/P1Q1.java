import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1Q1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        addScore(list);
//        displayScore(list);
        findLowest(list);
        findHighest(list);
        findAvg(list);
    }

    public static void addScore(List<Integer> list) {
        final int MAX_SCORE = 100;
        Scanner scanner = new Scanner(System.in);
        int inputScore;
        boolean input = true;

        do {
            System.out.print("Please Enter the Score (enter -ve value to stop): ");
            inputScore = scanner.nextInt();
            scanner.nextLine();

            if (inputScore > MAX_SCORE) {
                System.out.println("ERROR: The score should not be exceeding 100");
            } else if (inputScore >= 0) {
                list.add(inputScore);
            } else {
                input = false;
            }
        } while (input);
    }

    public static void displayScore(List<Integer> list) {
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    public static void findLowest(List<Integer> list) {
        int lowest = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(i-1)) {
                lowest = list.get(i);
            }
        }
        System.out.println("The lowest score is " + lowest);
    }

    public static void findHighest(List<Integer> list) {
        int highest = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) >= list.get(i-1)) {
                highest = list.get(i);
            }
        }
        System.out.println("The highest score is " + highest);
    }

    public static void findAvg(List<Integer> list) {
        int sum = 0;
        double avg;

        for (Integer integer: list) {
            sum += integer;
        }

        avg = (double) sum / (list.size());
        System.out.printf("Average Score = %.2f", avg);
    }
}
