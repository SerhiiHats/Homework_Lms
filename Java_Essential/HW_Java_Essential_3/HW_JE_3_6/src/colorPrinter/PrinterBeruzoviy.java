package colorPrinter;

public class PrinterBeruzoviy extends Printer{
    @Override
    void print(String value) {
        super.print("\u001B[36m" + value + "\u001B[0m");
    }
}
