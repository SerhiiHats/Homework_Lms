class Volume {
    public static void main(String[] args) {
        double radiusZilindra = 3.3;
        double visotaZilindra = 13.7;
        double obemZilindra, ploshaPoverhnostiZilindra;
        System.out.println("Домашнее задание 3");
        System.out.println("Задание 4. Напишите программу расчета объема - V и площади поверхности - S цилиндра");

        obemZilindra = Math.PI * Math.pow(radiusZilindra, 2) * visotaZilindra;
        System.out.println("4.1. Объем цилиндра с радиусом: " + radiusZilindra + " и высотой: " + visotaZilindra + ", равен: " + obemZilindra);
        ploshaPoverhnostiZilindra = 2 * Math.PI * radiusZilindra * (radiusZilindra + visotaZilindra);
        System.out.println("4.2. Площадь поверхности цилиндра с радиусом: " + radiusZilindra + " и высотой: " + visotaZilindra + ", равен: " + ploshaPoverhnostiZilindra);

        FromPerelikSimvol obj1 = new FromPerelikSimvol("@@");
        obj1.printUkraine();


    }
}
