public class Troll extends Monster implements Bleedable, Poisonable{
    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return (Math.random() < 0.5) ? getDamage() * 0.25 : 0;
    }

    @Override
    public double poison() {
        return (Math.random() < 0.3) ? getDamage() * 0.3 : 0;
    }
}
