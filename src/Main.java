import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    String name;
    String studentId;
    String address;

    public Student(String name, String studentId, String address) {
        this.name = name;
        this.studentId = studentId;
        this.address = address;
    }
}
class Book {
    String title;
    String author;
    String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

}

class Library{
    ArrayList<Book> ListeBooks = new ArrayList<>();
    ArrayList<Student> ListeStudents = new ArrayList<>();


    public void addBook(Book book) {
        ListeBooks.add(book);
    }

    public void removeBook(String ISBN) {
        for (Book book : ListeBooks) {
            if (book.ISBN.equals(ISBN)) {
                ListeBooks.remove(book);
                break;
            }
        }
    }

    public void displayBooks() {
        for (Book book : ListeBooks) {
            System.out.println("Title: " + book.title);
            System.out.println("Author: " + book.author);
            System.out.println("ISBN: " + book.ISBN);
            System.out.println();
        }
    }


    public void addStudent(Student student) { ListeStudents.add(student);
    }

    public void removeStudent(String name) {
        for (Student student : ListeStudents) {
            if (student.name.equals(name)) {
                ListeStudents.remove(student);
                break;
            }
        }
    }


    public void displayStudents() {
        for (Student student : ListeStudents) {
            System.out.println("name: " + student.name);
            System.out.println("studentId: " + student.studentId);
            System.out.println("address: " + student.address);
            System.out.println();
        }
    }


    public Book searchBook(String ISBN) {
        for (Book book : ListeBooks) {
            if (book.ISBN.equals(ISBN)) {
                return book;
            }
        }
        return null;  // Book not found
    }

}


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("1. ajouter un livre  \n ___________________");
            System.out.println("2. supprimer un livre \n ___________________");
            System.out.println("3. rechercher un livre\n ___________________");
            System.out.println("4. afficher des livres\n ===================");
            System.out.println("5. ajouter un éleve   \n ___________________");
            System.out.println("6. supprimer un éleve \n ___________________");
            System.out.println("7. afficher des éleve \n ===================");
            System.out.println("8. rechercher un livre\n ___________________");
            System.out.println("9. exit");

            int choice = scanner.nextInt();

            if (choice == 1) {
                scanner.nextLine();
                System.out.print("Enter title: ");
                String title = scanner.nextLine();
                System.out.print("Enter author: ");
                String author = scanner.nextLine();
                System.out.print("Enter ISBN: ");
                String ISBN = scanner.nextLine();
                library.addBook(new Book(title, author, ISBN));
            } else if (choice == 2) {
                scanner.nextLine(); // to consume the newline character
                System.out.print("Enter ISBN: ");
                String ISBN = scanner.nextLine();
                library.removeBook(ISBN);
            }
            else if (choice == 3) {
                scanner.nextLine();
                System.out.print("Enter ISBN of the book you want to search: ");
                String searchISBN = scanner.nextLine();

                Book foundBook = library.searchBook(searchISBN);
                if (foundBook != null) {
                    System.out.println("Book found:");
                    System.out.println("Title: " + foundBook.title);
                    System.out.println("Author: " + foundBook.author);
                    System.out.println("ISBN: " + foundBook.ISBN);
                    System.out.println();
                } else {
                    System.out.println("Book with ISBN " + searchISBN + " not found.");
                }}
            else if (choice == 4) {
                library.displayBooks();
            } else if (choice == 5) {
                scanner.nextLine();
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter studentId: ");
                String studentId = scanner.nextLine();
                System.out.print("Enter address: ");
                String address = scanner.nextLine();
                library.addStudent(new Student(name, studentId, address));
            } else if (choice == 6) {
                scanner.nextLine();
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                library.removeStudent(name);
            } else if (choice == 7) {
                library.displayStudents();
            }

        }
    }}
