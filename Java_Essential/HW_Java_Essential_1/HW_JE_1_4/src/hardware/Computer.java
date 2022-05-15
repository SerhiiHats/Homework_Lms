package hardware;

public class Computer {
    private String name;
    private int сpu;

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", cpu=" + сpu +
                '}';
    }

    public Computer () {
    }

    public Computer (String name, int cpu) {
        this.name = name;
        сpu = cpu;
    }

    public String getName() {
        return name;
    }

    public int getСpu() {
        return сpu;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setСpu(int сpu) {
        this.сpu = сpu;
    }


}
