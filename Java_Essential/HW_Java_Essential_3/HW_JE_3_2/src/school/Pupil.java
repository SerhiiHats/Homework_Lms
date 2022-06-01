package school;

public class Pupil {
    private String namePupil;

    public Pupil(String namePupil) {
        this.namePupil = namePupil;
    }

    void study(){
        System.out.println("Я учусь");

    }

    void read() {
        System.out.println("Я умею читать");

    }

    void write() {
        System.out.println("Я умею писать");
    }

    void relax() {
        System.out.println("Я отдыхаю после школы");
    }

    public String getNamePupil() {
        return namePupil;
    }

    public void setNamePupil(String namePupil) {
        this.namePupil = namePupil;
    }
}
