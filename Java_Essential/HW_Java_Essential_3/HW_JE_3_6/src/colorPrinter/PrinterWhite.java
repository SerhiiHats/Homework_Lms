package colorPrinter;

public class PrinterWhite extends Printer{
    @Override
    void print(String value) {
     super.print("\u001B[29m" + value + "\u001B[0m");
    }
}
