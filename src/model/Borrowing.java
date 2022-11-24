package model;

public class Borrowing {
    public Borrowing(int bookid, int studentid, int extradays, int fineRate) {
        this.bookid = bookid;
        this.studentid = studentid;
        this.extradays = extradays;
        this.fineRate = fineRate;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public int getExtradays() {
        return extradays;
    }

    public void setExtradays(int extradays) {
        this.extradays = extradays;
    }

    public int getFineRate() {
        return fineRate;
    }

    public void setFineRate(int fineRate) {
        this.fineRate = fineRate;
    }

    int bookid;
    int studentid;
    int extradays;
    int fineRate;

    public void getBorrowing() {
        System.out.println("SAMPLE BORROWING MODEL: ");
        System.out.println("The total fine for bookid " + this.bookid + " for " + this.extradays + " extra days is " + this.fineRate);
    }
}
