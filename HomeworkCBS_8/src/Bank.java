import java.util.Scanner;

class Bank {
    String nameKlient = "Иванов Иван Иванович";
    double kredit = 700;
    String timeStart = "январь 2022 г.";
    String timeEnd = "июль 2022 г.";
    double sposobPogashenijaKredita = 100;
    double pogashenijaKredita = 0;
    double sobstvenKlient = pogashenijaKredita - kredit;

    void viplata(double debitKlient) {
        String infoKredit;
        double infoSumKredit;
        double infoSobstvenKlient;
        pogashenijaKredita += debitKlient;
        sobstvenKlient = pogashenijaKredita - kredit;

        if (sobstvenKlient >= 0) {
            infoSumKredit = 0;
            infoKredit = "Долг отсутствует";
            infoSobstvenKlient = sobstvenKlient;

        } else {
            infoSumKredit = kredit - pogashenijaKredita;
            infoKredit = "Кредит не погашен";
            infoSobstvenKlient = 0;
        }

        System.out.println("********** Клиент " + nameKlient + " *********");
        System.out.println("сумма задолженности по Кредиту      : " + infoSumKredit + " грн. \nсостояние кредита                   : " + infoKredit + "\nличные средства клиента (переплата) : " + infoSobstvenKlient + " грн.");

    }

    void infoKredit() {
        double infoSobstvenKlient;
        String infoKredit;
        if (sobstvenKlient >= 0) {
            infoKredit = "Долг отсутствует";
            infoSobstvenKlient = sobstvenKlient;

        } else {
            infoKredit = Double.toString((kredit - pogashenijaKredita)) + " грн.";
            infoSobstvenKlient = 0;
        }
        System.out.println("********** Информация о Кредите *********");
        System.out.println("клиент Банка                        : " + nameKlient + "\nвыданый Банком Кредит               : " + kredit + " грн. \nдата оформления кредита             : " + timeStart + "\nдата погашения по договору          : " + timeEnd + "\nежемесячный платеж по договору      : " + sposobPogashenijaKredita + " грн. \nвсего погашено клиентом             : " + pogashenijaKredita + " грн. \nзадолженность по кредиту            : " + infoKredit + "\nличные средства клиента (переплата) : " + infoSobstvenKlient + " грн.");
    }


    public static void main(String[] args) {
        Bank objKlient1 = new Bank();
        double debetKlient;
        boolean cluchVihodaMenu = true;
        Scanner scan = new Scanner(System.in);
        while (cluchVihodaMenu) {
            System.out.println("\u001B[1;32m" + "1. информация о кредите    2. ввести суму погашения кредита    0. выход  (введите 1, 2 и 0)" + "\u001B[0m");
            switch (scan.next()) {
                case "1": {
                    objKlient1.infoKredit();
                    break;
                }
                case "2": {
                    boolean cluchVihodaVvodPogacheniya = true;
                    while (cluchVihodaVvodPogacheniya) {
                        System.out.println("Введите сумму погашения кредита: ");
                        if (scan.hasNextDouble()) {
                            debetKlient = scan.nextDouble();
                            if (debetKlient > 0) {
                                objKlient1.viplata(debetKlient);
                                cluchVihodaVvodPogacheniya = false;
                            } else {
                                System.out.println("Сумма погашения кредита не может быть меньше ноля, проверте и повторите");
                            }
                        } else {
                            System.out.println("Неверно введена сумма погашения кредита, можно только вещественное число которое через \" , \" ");
                            scan.next();
                        }
                    }

                    break;
                }
                default: {
                    cluchVihodaMenu = false;
                }
            }
        }
    }
}

