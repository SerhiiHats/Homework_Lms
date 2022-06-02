package colorPrinter;

public class PrinterGrey extends Printer{
    @Override
    void print(String value) {
        super.print("\u001B[37m" + value + "\u001B[0m");
    }
}
