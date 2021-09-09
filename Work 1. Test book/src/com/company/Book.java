package com.company;

public class Book {
    private String author;
    private int pages;
    private int year_of_issue;
    public Book(String n, int a, int b){
        author = n;
        pages = a;
        year_of_issue = b;
    }
    public Book(String n, int a){
        author = n;
        pages = a;
        year_of_issue = 0;
    }
    public Book(String n){
        author = n;
        pages = 0;
        year_of_issue = 0;
    }
    public Book(){
        author = "authorless";
        pages = 0;
        year_of_issue = 0;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor(String author){
        return author;
    }
    public int getPages() {
        return pages;
    }
    public String toString(){
        return this.author+", pages "+this.pages+", published in "+this.year_of_issue;
    }
}
