package c.oop2.practice;

import java.util.Arrays;

public class Library {
    // TODO: 필드 선언
    Book[] books;
    int bookCount;

    // TODO: 생성자
    public Library(int capacity){
        books = new Book[capacity];
        bookCount = 0;
    }

    // TODO: addBook(Book book) 메서드
    public void addBook(Book book){
        if (bookCount >= books.length){
            System.out.println("더 이상 책을 추가할 수 없습니다.");
            return;
        }
        books[bookCount] = book;
        bookCount++;
    }
    public void addBook(String title, String author){
        addBook(new Book(title, author));
    }
    public void addBook(String title, String author, int price){
        addBook(new Book(title, author, price));
    }

    // TODO: searchByTitle(String keyword) 메서드
    public void searchByTitle(String keyword){
        for (int i = 0; i < bookCount; i++){
            boolean check = books[i].getTitle().toLowerCase().contains(keyword.toLowerCase());

            if (check){
                books[i].displayInfo();
            }
        }
    }
    // TODO: searchByAuthor(String keyword) 메서드
    public void searchByAuthor(String keyword){
        for (int i = 0; i < bookCount; i++){
            boolean check = books[i].getAuthor().toLowerCase().contains(keyword.toLowerCase());

            if (check){
                books[i].displayInfo();
            }
        }
    }

    // TODO: displayAllBooks() 메서드
    public void displayAllBooks(){
        for (int i = 0; i < bookCount; i++){
            books[i].displayInfo();
        }
    }

    // TODO: getTotalPrice() 메서드
    public int getTotalPrice(){
        int total = 0;
        for (int i = 0; i < bookCount; i++){
            total += books[i].getPrice();
        }
        return total;
    }

    // TODO: getAveragePrice() 메서드
    public int getAveragePrice(){
        if (bookCount == 0){
            return 0;
        }
        return getTotalPrice() / bookCount;
    }

    // TODO: getBookCount() 메서드
    public int getBookCount(){
        return bookCount;
    }

    // TODO: applyDiscountToAll(int percent) 메서드
    public void applyDiscountToAll (int percent) {
        for (int i = 0; i < bookCount; i++){
            books[i].applyDiscount(percent);
        }
    }
}
