package uniprogress;

import java.util.ArrayList;
import java.util.Scanner;

public class UniProgress {

    ArrayList<Tests> testArrayList = new ArrayList<>();

    public static void main(String[] args) {
        UniProgress uniProgress = new UniProgress();
        uniProgress.mainMenu();
    }

    public void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean exit=true;
        while(exit){
            System.out.println("Please type 1 to create a SOB:");
            System.out.println("Please type 2 to create a coursework:");
            System.out.println("Please type -1 to exit the program.");
            int a = scanner.nextInt();
            switch(a){
                case 1:
                    testArrayList.add(getSOBDetails());
                    break;
                case 2:
                    testArrayList.add(getCourseworkDetails());
                    break;
                case -1:
                    exit=false;
                    break;
                    
                    default:
                        System.out.println("You have type incorrect value, please try again.");
                        break;
            }
        }
        
        //tests.add(test);
        //tests.add(test1);
    }

    public Tests getSOBDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in the world limit.");
        int wc = scanner.nextInt();
        System.out.println("Please type in the module number.");
        String moduleNumber = scanner.nextLine();
        System.out.println("Please type in the date.");
        String date = scanner.nextLine();
        String tutorsName = scanner.nextLine();
        String topic = scanner.nextLine();
        Tests test = new Coursework(wc, moduleNumber, date, tutorsName, topic);
        return test;
    }

    public Tests getCourseworkDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in the module number.");
        String moduleNumber = scanner.nextLine();
        String date = scanner.nextLine();
        String tutorsName = scanner.nextLine();
        String topic = scanner.nextLine();
        Tests test = new SOB(moduleNumber, date, tutorsName, topic);
        return test;
    }

}
