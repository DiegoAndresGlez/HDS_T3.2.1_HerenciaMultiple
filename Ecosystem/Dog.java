public class Dog extends Animal implements Organism {
    private String woof;
    private boolean mamifero = false;
    private boolean oviparo = false;

    public void setWoof(String woof) {
        this.woof = woof;
    }

    public String getWoof() {
        return woof;
    }

    public void setMamifero(boolean b) {
        mamifero = b;
    }

    public boolean getMamifero(boolean b) {
        return mamifero;
    }

    public void setOviparo(boolean b) {
        oviparo = b;
    }

    public boolean getOviparo(boolean b) {
        return oviparo;
    }

    public String toString() {
        String s = "";
        s += woof+"\n";
        s += "Mamifero = "+mamifero+"\n";
        s += "Oviparo = "+oviparo+"\n";
        return super.toString() + s;
    }
}
