package model;

public class Book {
    public String name;
    public String author;
    public String pubHouse;
    public int yearOFpub;
    public int amountOfPages;
    public double price;

    public Book() {
        name = "";
        author = "";
        pubHouse = "";
        yearOFpub = 0;
        amountOfPages = 0;
        price = 0;

    }



    public Book(String Name, String Author, String PubHouse, int YearOFpub, int AmountOfPages, double Price) {
        name = Name;
        author = Author;
        pubHouse = PubHouse;
        yearOFpub = YearOFpub;
        amountOfPages = AmountOfPages;
        price = Price;

    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPubHouse() {
        return pubHouse;
    }

    public int getYearOFpub() {
        return yearOFpub;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setAuthor(String Author) {
         this.author = Author;
    }

    public void setPubHouse(String PubHouse) {
        pubHouse = PubHouse;
    }


}