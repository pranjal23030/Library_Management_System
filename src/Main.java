import model.Books;
import model.Borrowing;
import model.Students;

public class Main {
    public static void main(String[] args) {
        Students no1 = new Students("Prayush Shrestha", 11,10);
        Students no2 = new Students("Pranjal Khatiwada", 12, 12);

        Books b1 = new Books("Da Vinci Code", "Dan Brown", 12345,2015);
        Books b2 = new Books("The Hope is here", "Pranjal Khatiwada", 45678, 2019);

        Borrowing bow1 = new Borrowing(1, 1,3,120);
        Borrowing bow2 = new Borrowing(2,2,4,130);

        b1.getBook();
        no1.getStudent();
        bow1.getBorrowing();
    }
}