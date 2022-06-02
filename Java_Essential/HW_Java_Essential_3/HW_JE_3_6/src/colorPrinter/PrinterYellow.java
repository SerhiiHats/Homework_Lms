package colorPrinter;

public class PrinterYellow extends Printer{
    @Override
    void print(String value) {
        super.print("\u001B[33m" + value + "\u001B[0m");
    }
}
