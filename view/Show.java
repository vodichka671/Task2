package view;

import controller.BooksAuthorComparator;
import controller.BooksPubHouseComparator;
import java.util.Arrays;
import model.Book;

import java.util.Scanner;

public class Show {

    public static Book[] SetOfBooks = {new Book("Хоббит","Толкин","Советы",1922,20121,1.74),
            new Book("Унесенные ветром","Маргарет Митчелл","1С",1932,2000,1.24),
            new Book("Сумерки","Стефани Майер","Наш Издатель",1982,20,1.24),
            new Book("Код да Винчи","Дэн Браун","Салют",1282,2022,1.34),
            new Book("Властелин колец","Толкин","Советы",1882,2011,1.74),
            new Book("Гарри Поттер","Джоан Роулинг","1С",1982,20123,2.24),
            new Book("Цитаты Мао Цзэдун","Мао Цзэдун","Фаргус",1282,9000,7.24),
            new Book("Библия","Бог","Небеса",0,30000,90.24)};

    public static String[] ShowAuthors(){

        System.out.println("Choose Author ! ");
        String[] authorsSet = new String[SetOfBooks.length];
        for (int i = 0; i <SetOfBooks.length ; i++) {

            System.out.println(i+": "+SetOfBooks[i].getAuthor());
        }
        return authorsSet;
    }

    public static void ShowBookOfAuthor(Scanner read){

        int choose = read.nextInt();
        Book b = new Book();

        b.setAuthor(SetOfBooks[choose].getAuthor());


        BooksAuthorComparator comp = new BooksAuthorComparator();
        System.out.println("Books of author : ");
        int count =0;
        for (Book book: SetOfBooks) {

            if(comp.compare(book,b)==0){
                count++;
                System.out.println(count+": "+book.getName());
            }

        }
    }

    public static String[] ShowPublishers(){

        System.out.println("Choose Publisher ! ");
        String[] pubSet = new String[SetOfBooks.length];
        for (int i = 0; i <SetOfBooks.length ; i++) {

            System.out.println(i+": "+SetOfBooks[i].getPubHouse());
        }
        return pubSet;
    }

    public static void ShowBookOfPublisherr(Scanner read){

        int choose = read.nextInt();
        Book b = new Book();

        b.setPubHouse(SetOfBooks[choose].getPubHouse());


        BooksPubHouseComparator comp = new BooksPubHouseComparator();
        System.out.println("Books of publisher : ");
        int count =0;
        for (Book book: SetOfBooks) {

            if(comp.compare(book,b)==0){
                count++;
                System.out.println(count+": "+book.getName());
            }

        }
    }

    public static void ShowBooksLater(Scanner read){
        System.out.println("Choose year : ");
        int year = read.nextInt();
        int counter = 0;
        for (int i = 0; i <SetOfBooks.length ; i++) {
            if (SetOfBooks[i].getYearOFpub()>=year){
                counter++;
                System.out.println(counter+": "+SetOfBooks[i].getName());
            }
        }

    }
    public static void ShowSetOfBooks(){
        for (int i = 0; i <SetOfBooks.length ; i++) {
            System.out.println("Name: "+SetOfBooks[i].getName()+"\n"+"Author: "+SetOfBooks[i].getAuthor()+"\n"
            +"Publisher: "+SetOfBooks[i].getPubHouse()+"\n"+"Year of publication: "+SetOfBooks[i].getYearOFpub()+"\n"
            +"Pages: "+SetOfBooks[i].getAmountOfPages()+"\n"+"Price: "+SetOfBooks[i].getPrice());
            System.out.println("//////////////////////////////////////////////////////////////////////////////");
        }
    }





    public static void menu(){


        System.out.println("0: Get Books of Author");
        System.out.println("1: Get Books of particular Publisher");
        System.out.println("2: Get Books with pib Data later then ...");
        System.out.println("3: Sort by publisher");


        Scanner reader = new Scanner(System.in);
        int decision = reader.nextInt();


        switch (decision){
            case 0 : ShowAuthors(); ShowBookOfAuthor(reader);break;
            case 1 : ShowPublishers(); ShowBookOfPublisherr(reader);break;
            case 2 : ShowBooksLater(reader);break;
            case 3 : Arrays.sort(SetOfBooks,new BooksPubHouseComparator());ShowSetOfBooks();


        }

        System.out.println("You want to continue ? 1/0 : ");
        int ch = reader.nextInt();
        if(ch==1){
            menu();
        }


    }
}
