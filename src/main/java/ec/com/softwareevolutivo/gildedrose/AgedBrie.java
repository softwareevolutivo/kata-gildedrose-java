package ec.com.softwareevolutivo.gildedrose;

public class AgedBrie extends Item{

    public AgedBrie (int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    public void updateQuality(){
        if (this.quality < 50) {
            this.quality++;
        }
        this.sellIn--;
        if (this.sellIn < 0 && this.quality < 50) {
            this.quality++;
        }
    }

}
