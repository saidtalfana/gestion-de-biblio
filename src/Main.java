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

