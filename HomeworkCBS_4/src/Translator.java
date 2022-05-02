import java.util.Scanner;

class Translator {
   public static void main(String[] args) {
        Scanner scSlovo = new Scanner(System.in);
       System.out.println("Десять слов о погоде на английском языке");

       while (true) {
           System.out.println("Какая сегодня погода? введите слово на руском: ");
           switch (scSlovo.next()) {
               case "холодно": {                      // 1 слово
                   System.out.println(" - сold");
                   break;
               }
               case "жарко": {                       // 2 слово
                   System.out.println(" - hot");
                   break;
               }
               case "дождливо": {                       // 3 слово
                   System.out.println(" - rainy");
                   break;
               }
               case "прохладно": {                   // 4 слово
                   System.out.println(" - cool");
                   break;
               }
               case "морозно": {                     // 5 слово
                   System.out.println(" - frosty");
                   break;
               }
               case "солнечно": {                       // 6 слово
                   System.out.println(" - sunny");
                   break;
               }
               case "ясно": {                          // 7 слово
                   System.out.println(" - clear");
                   break;
               }
               case "снежно": {                          // 8 слово
                   System.out.println(" - snowy");
                   break;
               }
               case "облачно": {                          // 9 слово
                   System.out.println(" - cloudy");
                   break;
               }
               case "ветрено": {                          // 10 слово
                   System.out.println(" - windy");
                   break;
               }
               default: {
                   System.out.println("\u001B[31m" + "У нас нет перевода для этого слова" + "\u001B[0m");
               }
           }
           System.out.println("\u001B[32m" + "Продолжим?" + "\u001B[0m" + " для выхода нажмите \" н \" чтоб продолжить нажмите любую клавишу: ");
           if (scSlovo.next().equalsIgnoreCase("н")) break;
       }
       System.out.println("Конец программы");
    }
}
