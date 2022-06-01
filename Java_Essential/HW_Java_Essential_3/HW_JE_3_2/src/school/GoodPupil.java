package school;

public class GoodPupil extends Pupil{
    public GoodPupil(String namePupil) {
        super(namePupil);
    }
    @Override
    void study() {
        System.out.println("Я хорошист, получаю средние оценки, планирую поступать в техникум");
    }

    @Override
    void read() {
        System.out.println("Я умею читать средне, сильно много читать я не люблю");
    }

    @Override
    void write() {
        System.out.println("Я умею писать, но иногда допускаю ошибки, грамматику мне нужно подтянуть");
    }

    @Override
    void relax() {
        System.out.println("Некоторое время у меня уходит на домашние задания, а все остальное время я провожу с семьёй");
    }
}
