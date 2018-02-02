package uniprogress;

import java.util.ArrayList;
import java.util.Scanner;

public class UniProgress {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in the world limit.");
        int wc = scanner.nextInt();
        System.out.println("Please type in the module number.");
        String moduleNumber = scanner.nextLine();
        String date = scanner.nextLine();
        String tutorsName = scanner.nextLine();
        String topic = scanner.nextLine();
        ArrayList<Tests> tests = new ArrayList<>();
        Tests test = new Coursework(wc, moduleNumber, date, tutorsName, topic);
        Tests test1 = new SOB(moduleNumber, date, tutorsName, topic);
        tests.add(test);
        tests.add(test1);
    }
    
}
