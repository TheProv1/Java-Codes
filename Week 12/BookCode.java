import java.util.*;

class Book implements Comparable<Book>{
    private String name;
    private double cost;

    public Book(String name, double cost){
        this.name = name;
        this.cost = cost;
    }

    public String getName(){
        return this.name;
    }

    public double getCost(){
        return this.cost;
    }

    @Override
    public int compareTo(Book otherBook) {
        return this.name.compareTo(otherBook.getName());
    }
}

class GeneralizedSearch{
    public static boolean search(Book[] arr, String bookName){
        boolean flag = false;
        for (int i = 0; i < arr.length; i++){
            if (arr[i].getName().equals(bookName)){
                flag = true;
                break;
            }
        }
        return flag;
    }
}

class BookCode{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfBooks;
        double cost;
        String bookName;

        Book[] books;

        System.out.print("Enter the number of books: ");
        numberOfBooks = sc.nextInt();
        sc.nextLine();

        books = new Book[numberOfBooks];

        for (int i = 0; i < numberOfBooks; i++){
            System.out.print("\nEnter the name of the book: ");
            bookName = sc.nextLine();

            System.out.print("Enter the cost of the book: ");
            cost = sc.nextDouble();
            sc.nextLine();

            books[i] = new Book(bookName, cost);
        }

        System.out.print("\n\nAvailable Books\n\n");
        for (int i = 0; i < books.length; i++){
            System.out.print("Name: " + books[i].getName() + " Cost: " + books[i].getCost() + "\n");
        }

        System.out.print("Enter the name of the book to search: ");
        String searchBookName = sc.nextLine();

        boolean bookSearchReturnValue = GeneralizedSearch.search(books, searchBookName);

        if (bookSearchReturnValue){
            System.out.print("Book has been found. Congrats");
        }

        else{
            System.out.print("Book titled: " + searchBookName + " not found");
        }

        sc.close();
    }
}
