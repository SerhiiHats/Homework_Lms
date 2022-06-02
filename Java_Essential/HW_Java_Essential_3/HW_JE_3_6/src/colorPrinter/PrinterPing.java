package colorPrinter;

public class PrinterPing extends Printer{
    @Override
    void print(String value) {
        super.print("\u001B[35m" + value + "\u001B[0m");
    }
}
