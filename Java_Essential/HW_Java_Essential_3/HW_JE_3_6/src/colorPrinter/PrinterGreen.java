package colorPrinter;

public class PrinterGreen extends Printer{
    @Override
    void print(String value) {
        super.print("\u001B[32m" + value + "\u001B[0m");
    }
}
