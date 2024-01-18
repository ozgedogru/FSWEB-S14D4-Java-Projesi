public class MonsterTest {
    public static void main(String[] args) {
        Troll troll = new Troll("Troll", 100, 20);

        System.out.println("Yaratık Adı: " + troll.getName());
        System.out.println("Can: " + troll.getHitPoints());
        System.out.println("Hasar: " + troll.getDamage());

        double totalDamage = troll.attack();

        System.out.println("Toplam Hasar: " + totalDamage);

        if (totalDamage > troll.getDamage()) {
            double bleedDamage = troll.bleed();
            double poisonDamage = troll.poison();

            if (bleedDamage > 0) {
                System.out.println("Kanatma Hasarı: " + bleedDamage);
            }

            if (poisonDamage > 0) {
                System.out.println("Zehirleme Hasarı: " + poisonDamage);
            }
        }
    }
}
