package engetelecom.poo.superClasses;

public class Oviparo extends Animal {

    boolean possuiPenas;

    public Oviparo(boolean possuiPenas) {
        this.possuiPenas = possuiPenas;
    }

    public String botarOvo() {

        return "botou um ovo!";
    }

}
