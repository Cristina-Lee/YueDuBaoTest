package com.example.yueduabaotest.Activity;

public class Book {
    private int iId;//书籍图片id
    private String iName;//书名
    private String author;//作者名
    private  String bIntro;//书籍简介

    public Book() {
    }

    public Book(int iId, String iName) {
        this.iId = iId;
        this.iName = iName;
    }
    public Book(int iId, String  iName, String author, String bIntro){
        this.iId=iId;
        this.iName=iName;
        this.author=author;
        this.bIntro=bIntro;
    }

    public int getiId() {
        return iId;
    }

    public String getiName() {
        return iName;
    }

    public String getAuthor() {
        return author;
    }

    public String getbIntro() {
        return bIntro;
    }

    public void setiId(int iId) {
        this.iId = iId;
    }

    public void setiName(String iName) {
        this.iName = iName;
    }

    public void setAuthor(String author) {
        this.iName = author;
    }

    public void setbIntro(String bIntro) {
        this.iName = bIntro;
    }
}
