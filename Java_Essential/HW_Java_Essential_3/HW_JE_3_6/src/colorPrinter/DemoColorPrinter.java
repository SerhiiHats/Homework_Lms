package colorPrinter;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoColorPrinter {
    public static void main(String[] args) {
        ArrayList<Printer> arrPrint = new ArrayList<>();
        Printer obj1 = new PrinterWhite();               // "\u001B[29m" + value + "\u001B[0m" - цвет в дефолт
        Printer obj2 = new PrinterBlack();               // "\u001B[30m" + value + "\u001B[0m" - цвет в дефолт
        Printer obj3 = new PrinterRed();                 // "\u001B[31m" + value + "\u001B[0m" - цвет в дефолт
        Printer obj4 = new PrinterGreen();               // "\u001B[32m" + value + "\u001B[0m" - цвет в дефолт
        Printer obj5 = new PrinterYellow();              // "\u001B[33m" + value + "\u001B[0m" - цвет в дефолт
        Printer obj6 = new PrinterBlue();                // "\u001B[34m" + value + "\u001B[0m" - цвет в дефолт
        Printer obj7 = new PrinterPing();                // "\u001B[35m" + value + "\u001B[0m" - цвет в дефолт
        Printer obj8 = new PrinterBeruzoviy();           // "\u001B[36m" + value + "\u001B[0m" - цвет в дефолт
        Printer obj9 = new PrinterGrey();                // "\u001B[37m" + value + "\u001B[0m" - цвет в дефолт
        arrPrint.addAll(Arrays.asList(obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9));

        for (Printer p : arrPrint) {
            System.out.print(p.getClass() + "     : ");
            p.print(p.getValue());
        }

    }
}
