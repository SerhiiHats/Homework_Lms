package colorPrinter;

public class PrinterBlack extends Printer{
    @Override
    void print(String value) {
        super.print("\u001B[30m" + value + "\u001B[0m");
    }
}
