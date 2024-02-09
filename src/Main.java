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
    List<Book> ListeBooks = new ArrayList<>();
    List<Student> ListeStudents = new ArrayList<>();


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
    }}
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("1. ajouter un livre \n___________________");
            System.out.println("2. supprimer un livre \n___________________");
            System.out.println("3. afficher des livres\n___________________");
            System.out.println("4. ajouter un éleve \n___________________");
            System.out.println("5. supprimer un éleve \n___________________");
            System.out.println("6. afficher des éleve\n___________________");
            System.out.println("7. exit");

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
            } else if (choice == 3) {
                library.displayBooks();
            }
            else if (choice == 4){
                scanner.nextLine();
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter studentId: ");
                String studentId = scanner.nextLine();
                System.out.print("Enter adrress: ");
                String adrress = scanner.nextLine();
                library.addStudent(new Student(name, studentId, adrress));}

            else if (choice == 5) {
                scanner.nextLine();
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                library.removeStudent(name);
            }
            else if (choice == 6) {
                library.displayStudents();
            }
            else if (choice == 7) {
                break;
            }
        }
    }}

