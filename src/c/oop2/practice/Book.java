package c.oop2.practice;

public class Book {
    // TODO: 필드 선언
    String title;
    String author;
    int price;
    String isbn;

    // TODO: 생성자 오버로딩 (this()를 사용하여 연결)
    public Book(String title, String author){
        this(title, author, 0, "null");
    }

    public Book(String title, String author, int price){
        this(title, author, price, "null");
    }

    public Book(String title, String author, int price, String isbn){
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    // TODO: displayInfo() 메서드
    public void displayInfo(){
        displayInfo(false);
    }
    // TODO: displayInfo(boolean detailed) 메서드 오버로딩
    public void displayInfo(boolean detailed){
        System.out.println(title + " - 저자: " + author + ", 가격: " + price + "원");
        if(detailed && isbn != null){
            System.out.println(isbn);
        }
    }

    // TODO: applyDiscount(int percent) 메서드
    public void applyDiscount(int percent){
        price = price * (100 - percent) / 100;
    }
    // TODO: applyDiscount(int amount, boolean isPercent) 메서드 오버로딩
    public void applyDiscount(int amount, boolean isPercent){
        if (isPercent){
            applyDiscount(amount);
        } else {
            price = price - amount;
        }
    }

    // TODO: getTitle() 메서드
    // 제목 반환
    public String getTitle(){
        return title;
    }

    // TODO: getAuthor() 메서드
    // 저자 반환
    public String getAuthor(){
        return author;
    }

    // TODO: getPrice() 메서드
    // 가격 반환
    public int getPrice(){
        return price;
    }

}
