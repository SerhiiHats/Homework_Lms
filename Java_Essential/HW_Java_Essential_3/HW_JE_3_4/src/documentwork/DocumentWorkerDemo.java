package documentwork;

import java.util.Scanner;

public class DocumentWorkerDemo {
    public static void main(String[] args) {

        boolean keyOutSwitch = true;
        Scanner scan = new Scanner(System.in);
        DocumentWorker obj;

        System.out.println("Введите номер ключа доступа к pro и exp - версии (для теста 1 и 2 соответственно), также Вы можете использовать бесплатную версию");

        switch (scan.next()) {
            case "1": {
                obj = new ProDocumentWorker();
                break;
            }
            case "2": {
                obj = new ExpertDocumentWorker();
                break;
            }
            default: {
                obj = new DocumentWorker();
            }
        }

        while (keyOutSwitch) {
            obj.seeVersion();
            System.out.println("\u001B[1;32m" + "1.Открыть документ  2.Редактировать документ  3.Сохранить документ 0.(или другой) выход" + "\u001B[0m");
            switch (scan.next()) {
                case "1": {
                    obj.openDocument();
                    break;
                }
                case "2": {
                    obj.editDocument();
                    break;
                }
                case "3": {
                    obj.saveDocument();
                    break;
                }
                default: {
                    keyOutSwitch = false;
                }
            }
        }
        System.out.println("Конец программы");
        scan.close();
    }
}
