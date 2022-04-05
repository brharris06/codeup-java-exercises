public class Monster {
    private String name;
    private int armorClass;
    private int hitPoints;
    private int damage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


    public Monster(String name, int armorClass, int hitPoints, int damage) {
        this.name = name;
        this.armorClass = armorClass;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    public String attack(Monster opponent){
        int initialOpponentHp = opponent.hitPoints;
        opponent.hitPoints -= this.damage;
        return this.name + " hit " + opponent.name + " for " + this.damage + " points of damage.\n" +
                opponent.name + " now has " + opponent.hitPoints + " hit points left." ;
    }

//    public String toString(){
//        return name;
//    }
}
