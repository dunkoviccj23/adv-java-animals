package us.mattgreen;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInputGathering {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Talkable> zoo;

    UserInputGathering(ArrayList zoo) {
        this.zoo = zoo;
    }

    public void addAnimal() {
        System.out.println("What type of animal do you want to create? A dog or a cat?");
        String UserInput = scanner.nextLine();

        if (UserInput.equals("dog")) {
            System.out.println("What's the dog's name?");
            String DogsName = scanner.nextLine();

            System.out.println("Is it friendly (y/n)?");
            String IsFriendly = scanner.nextLine();
            boolean IsDogFriendly = IsFriendly == "y";

            zoo.add(new Dog(IsDogFriendly, DogsName));
        } else if (UserInput.equals("cat")) {
            System.out.println("What's the cat's name?");
            String CatsName = scanner.nextLine();

            System.out.println("How many mice has it killed?");
            String MiceKilled = scanner.nextLine();

            zoo.add(new Cat(Integer.parseInt(MiceKilled), CatsName));
        }
    }
}
