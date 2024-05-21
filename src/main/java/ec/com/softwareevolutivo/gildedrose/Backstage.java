package ec.com.softwareevolutivo.gildedrose;

public class Backstage extends Item{

    public Backstage (int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (this.quality < 50) {
            this.quality++;
            if (this.sellIn < 11 && this.quality < 50) {
                this.quality++;
            }
            if (this.sellIn < 6 && this.quality < 50) {
                this.quality++;
            }
        }
        this.sellIn--;
        if (this.sellIn < 0) {
            this.quality = 0;
        }
    }
}
