package school;

public class BadPupil extends Pupil{
    public BadPupil(String namePupil) {
        super(namePupil);
    }
    @Override
    void study() {
        System.out.println("Я иногда получаю плохие оценки, но я непланирую никуда поступать");
    }

    @Override
    void read() {
        System.out.println("Я не люблю читать, потомучто плохо читаю");
    }

    @Override
    void write() {
        System.out.println("Я умею писать немного, но у меня постоянные ошибки");
    }

    @Override
    void relax() {
        System.out.println("Все свое свободное время я провожу с друзьями играя в различные игры, учеба меня не интересует");
    }
}
