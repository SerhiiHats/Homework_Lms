package school;

import java.util.ArrayList;

public class ClassRoom {

    ArrayList <Pupil> pupils = new ArrayList<>();   //  Использование ArrayList выгодней отличается от Array т.к. он динамически расширяется и отпадает необходимость заранее резервировать память при инициализации

    public ClassRoom(Pupil ...obj) {     //    такой конструктор позволит нам принимать любое количество учеников в учебный класс
        for (Pupil p : obj) {
            pupils.add(p);            // pupils.addAll(Arrays.asList(obj));    // в место цикла для записи в ArrayList можно использовать упрощенную
        }
    }

    void tolkme() {
        for (Pupil p : pupils) {
            System.out.println("Привет Я: " + p.getNamePupil());
            p.study();
            p.read();
            p.write();
            p.relax();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pupil obj1 = new ExcelentPupil("Иван");
        Pupil obj2 = new GoodPupil("Надежда");
        Pupil obj3 = new ExcelentPupil("Оксана");
        Pupil obj4 = new BadPupil("Алексей");

        ClassRoom classRoom = new ClassRoom(obj1, obj2, obj3, obj4);
        System.out.println("\u001B[1;32m" + "Учебный клас из : " + classRoom.pupils.size() + " учеников" + "\u001B[0m");
        classRoom.tolkme();

//         так как конструктор использует метод с множиством аргументов, а также используется
//         ArrayList для хранения созданых учеников - добовлять можно: и 2, и 3, или любое количество учеников в класс
//
//        ClassRoom classRoom = new ClassRoom(obj1, obj2);
//        System.out.println("\u001B[1;32m" + "Учебный клас из : " + classRoom.pupils.size() + " учеников" + "\u001B[0m");
//        classRoom.tolkme();


    }

}
