import java.util.Scanner;
public class MontyHallRunner {
    public static void main(String[]args){
        boolean swap;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Monty Hall Game!\n");
        System.out.println("There are two goats and a car randomly behind door 1,2 and 3.");
        System.out.println("Where do you think the car is? Enter 1, 2, or 3: ");
        int guess = scan.nextInt();
        new MontyHall(guess);

        System.out.println("Do you want to switch your guess? Yes or No: ");
        String a = scan.nextLine();
        if (a.equals("Yes") || a.equals("yes")){
            swap = true;
        }else{
            swap = false;
        }
    }
}
