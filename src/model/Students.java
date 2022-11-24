package model;

public class Students {
    public String getStudent_name() {
        return student_name;
    }

    public int getStudent_class() {
        return student_class;
    }

    public int getBorrowed_books() {
        return borrowed_books;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public void setStudent_class(int student_class) {
        this.student_class = student_class;
    }

    public void setBorrowed_books(int borrowed_books) {
        this.borrowed_books = borrowed_books;
    }

    String student_name;
    int student_class;
    int borrowed_books;

    public Students(String student_name, int student_class, int borrowed_books) {
        this.student_name = student_name;
        this.student_class = student_class;
        this.borrowed_books = borrowed_books;
    }

    public void getStudent() {
        System.out.println("STUDENT FORMAT: ");
        System.out.println("The student is: " + this.student_name + " of class " + this.student_class + " and has " + this.borrowed_books + " books borrowed.");
    }
}
