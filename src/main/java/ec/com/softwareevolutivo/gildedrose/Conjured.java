package ec.com.softwareevolutivo.gildedrose;

public class Conjured extends Item{

    public Conjured (int sellIn, int quality) {
        super("Conjured", sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (this.quality > 0) {
            this.quality = quality-2;
        }
        this.sellIn--;
    }
}
