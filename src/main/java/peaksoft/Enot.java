package peaksoft;

public class Enot implements Animal {

    private String poroda;
    private String color;


    public Enot() {
    }

    public Enot(String poroda, String color) {
        this.poroda = poroda;
        this.color = color;
    }

    @Override
    public void animalPlus() {
        System.out.println("EnotPlus - Zabavnyi");
    }

    @Override
    public void animalMinus() {
        System.out.println("EnotMinus - Nepriyatnyi zapah");
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
