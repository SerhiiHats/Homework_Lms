package school;

public class BadPupil extends Pupil{
    public BadPupil(String namePupil) {
        super(namePupil);
    }
    @Override
    void study() {
        System.out.println("Плохо учюсь, получаю плохие оценки, но я непланирую никуда поступать");
    }

    @Override
    void read() {
        System.out.println("Читать я не люблю, потому-что плохо читаю");
    }

    @Override
    void write() {
        System.out.println("Писать я не умею, допускаю постоянные ошибки");
    }

    @Override
    void relax() {
        System.out.println("Все свое свободное время я провожу с друзьями играя в различные игры, учеба меня не интересует");
    }
}
