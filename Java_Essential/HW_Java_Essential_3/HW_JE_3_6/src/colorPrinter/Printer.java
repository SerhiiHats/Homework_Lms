package colorPrinter;

public class Printer {
    String value = "Полиморфизм, печатаем одним и тем же методом различными цветами в Сабклассах";

    public String getValue() {
        return value;
    }

    void print(String value) {
        System.out.println(value);
    }


}
