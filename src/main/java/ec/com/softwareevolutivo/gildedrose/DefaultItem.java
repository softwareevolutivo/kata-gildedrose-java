package ec.com.softwareevolutivo.gildedrose;

public class DefaultItem extends Item{

    public DefaultItem (String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (this.quality > 0) {
            this.quality--;
        }
        this.sellIn--;
        if (this.sellIn < 0 && this.quality > 0) {
            this.quality--;
        }
    }
}
