package school;

public class ClassRoom {
    private Pupil[] pupils;

    public ClassRoom(Pupil x1, Pupil x2, Pupil x3, Pupil x4) {
        this.pupils = new Pupil[]{x1, x2, x3, x4};
    }

    public ClassRoom(Pupil x1, Pupil x2, Pupil x3) {
        this.pupils = new Pupil[]{x1, x2, x3};
    }

    public ClassRoom(Pupil x1, Pupil x2) {
        this.pupils = new Pupil[]{x1, x2};
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
        Pupil obj3 = new BadPupil("Алексей");
        Pupil obj4 = new ExcelentPupil("Оксана");
        ClassRoom classRoom = new ClassRoom(obj1, obj2, obj3, obj4);
        classRoom.tolkme();


    }

}
