package colorPrinter;

public class PrinterBlue extends Printer{
    @Override
    void print(String value) {
        super.print("\u001B[34m" + value + "\u001B[0m");
    }
}
