package modul4.uebung17;

public class PremiumBoots extends Timberland {

    public PremiumBoots(String color, String material, String sole, boolean water) {
        super(color, material, sole, water);
    }

    @Override
    public void tieShoes() {
        System.out.println("Gebunden mit Gummiband");
    }
}
