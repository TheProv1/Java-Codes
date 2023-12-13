import java.util.*;

class Book
{
     long isbnno;
     String name;
     String author;
     String publisher;
     int status;
     int edition;
    
     void checkStatus(String name)
    {
        System.out.print("\nStatus: " + status);
    }

     void modifyStatus(int checkstatus)
    {
        if (checkstatus == status)
        {
            if (status == 1)
            {
                status = 0;
            }

            else
            {
                status = 1;
            }
        }

        else
        {
            System.out.print("The status entered is incorrect: ");
        }
    }

     void display()
    {
        System.out.println("Book Name: " + name + "\nAuthor" + author + "\nISBN Number" + isbnno + "\nPublisher" + publisher + "\nStatus" + status + "\nBook Edition" + edition );
    }
}

class BookDetails
{
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Book[] b = new Book[2];

        for (int i = 0; i < 2; i++)
        {
            System.out.println("Enter the details for Book " + (i + 1));

            b[i] = new Book();

            System.out.print("\nEnter the Book Name: ");
            b[i].name = sc.nextLine();

            System.out.print("\nEnter the Book Edition: ");
            b[i].edition = sc.nextInt();

            System.out.print("\nEnter the name of the Author: ");
            b[i].author = sc.nextLine();

            System.out.print("\nEnter the ISBN Number of the book: ");
            b[i].isbnno = sc.nextLong();

            System.out.print("\nEnter the name of the Publisher: ");
            b[i].publisher = sc.nextLine();

            System.out.println("\nEnter the Book Status: ");
            b[i].status = sc.nextInt();
        }

        for (int i = 0; i < 10; i++)
        {

            System.out.print("Menu/n1. Check book status\n2. Change book status\n3. Display Book details\nEnter your choice: ");
            int option = sc.nextInt();

            if (option == 1)
            {
                System.out.print("\nEnter the name of the book");
                String getbookname = sc.nextLine();

                b[i].checkStatus(getbookname);                
            }

            else if (option == 2)
            {
                System.out.print("Enter the current status of the book");
                int ver = sc.nextInt();

                b[i].modifyStatus(ver);
            }

            else if (option == 3)
            {
                b[i].display();
            }

            else
            {
                System.out.print("Option entered does not exist");
                break;
            }
        }
    sc.close();
    }
}
