import java.util.*;

abstract class Animal{
    String name;

    public Animal(String name){
        this.name = name;
    }

    public abstract void greets();
}

class Cat extends Animal{
    public Cat(String name){
        super(name);
    }

    @Override
    public void greets(){
        System.out.println("Meow");
    }
}

class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    @Override
    public void greets(){
        System.out.println("Woof");
    }

    public void greets(Dog dog){
        System.out.println("Woooof");
    }
}

class BigDog extends Dog{
    public BigDog(String name){
        super(name);
    }

    @Override
    public void greets(){
        System.out.println("Wooow");
    }

    @Override
    public void greets(Dog dog){
        System.out.println("Woooooow");
    }

    public void greets(BigDog bigdog){
        System.out.println("Wooooooooow");
    }
}

public class AnimalCode{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option = 10;
        String animalName;

        while (option != 4){
            System.out.print("\n\t\t\tMain Menu\n1. Cat \n2. Dog \n3. Big Dog \n4. Exit \nEnter your choice: ");
            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1){
                System.out.print("Enter the name of the Cat: ");
                animalName = scanner.nextLine();

                Cat cat = new Cat(animalName);
                
                System.out.print("What does the cat say: ");
                cat.greets();
            }

            else if (option == 2){
                System.out.print("Enter the name of the Dog: ");
                animalName = scanner.nextLine();
                Dog dog = new Dog(animalName);

                System.out.print("What does the dog say: ");
                dog.greets();
                
                
                System.out.print("Meeting another dog: ");
                dog.greets(dog);
            }

            else if (option == 3){
                System.out.print("Enter the name of the Big Dog: ");
                animalName = scanner.nextLine();
                BigDog bigdog = new BigDog(animalName);
                Dog dog = new Dog(animalName);

                System.out.print("What does the big dog say: ");
                bigdog.greets();

                System.out.print("Meeting another dog: ");
                bigdog.greets(dog);

                System.out.print("Meeting another bigdog: ");
                bigdog.greets(bigdog);
            }

            else {
                System.out.println("Invalid option entered");
            }
        }
        scanner.close();
    }
}
