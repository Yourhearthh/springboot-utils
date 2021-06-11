package com.example.book.entity;

/**
 * @Author baoguangyu
 * @Date 2021/6/11 13:38
 * @Version 1.0
 */
public class Book {
    private int id;
    private String bookName;
    private int price;

    public Book(int id, String bookName, int price) {
        this.id = id;
        this.bookName = bookName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", price=" + price +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
