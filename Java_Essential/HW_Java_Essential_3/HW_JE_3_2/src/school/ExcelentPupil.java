package school;

public class ExcelentPupil extends Pupil {
    public ExcelentPupil(String namePupil) {
        super(namePupil);
    }

    @Override
    void study() {
        System.out.println("Я учусь на отлично и буду поступать в университет");
    }

    @Override
    void read() {
        System.out.println("Я уже хорошо читаю, скорость чтения у меня высокая, я могу прочитать целую книгу");
    }

    @Override
    void write() {
        System.out.println("Я умею писать без ошибок и знаю все правила");
    }

    @Override
    void relax() {
        System.out.println("Из - за того что я очень много изучаю, у меня совсем мало времени на отдых");
    }
}
