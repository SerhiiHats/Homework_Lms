package school;

public class GoodPupil extends Pupil{
    public GoodPupil(String namePupil) {
        super(namePupil);
    }
    @Override
    void study() {
        System.out.println("Средне учюсь, получаю средние оценки, планирую поступать в техникум");
    }

    @Override
    void read() {
        System.out.println("Средне умею читать, сильно много читать я не люблю");
    }

    @Override
    void write() {
        System.out.println("Пишу иногда с ошибками, грамматику мне нужно подтянуть");
    }

    @Override
    void relax() {
        System.out.println("Некоторое время у меня уходит на домашние задания, а все остальное время я провожу с семьёй");
    }
}
