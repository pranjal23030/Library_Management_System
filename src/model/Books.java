package model;

public class Books {
    String name;
    String author;
    int isbn;

    public Books(String name, String author, int isbn, int published_year) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.published_year = published_year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getPublished_year() {
        return published_year;
    }

    public void setPublished_year(int published_year) {
        this.published_year = published_year;
    }

    int published_year;

    public void getBook() {
        System.out.println("BOOKS FORMAT: ");
        System.out.println("Name: " + this.name);
        System.out.println("Author: " + this.author);
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Published Year: " + this.published_year);
    }
}
