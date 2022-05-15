import description.Author;
import description.Content;
import description.Title;

import java.util.Scanner;

public class Book {

    public static void main(String[] args) {
        Title obj1 = new Title();
        Author obj2 = new Author();
        Content obj3 = new Content();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название книги : ");
        obj1.setTitle(scanner.nextLine());
        System.out.println("Введите автора         : ");
        obj2.setAuthor(scanner.nextLine());
        System.out.println("Введите содержание     : ");
        obj3.setContent(scanner.nextLine());
        obj1.show();
        obj2.show();
        obj3.show();
    }

}
