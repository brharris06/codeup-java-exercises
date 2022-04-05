public class MonsterTest {
    public static void main(String[] args) {

        Monster orc = new Monster("Orc", 13, 15, 9);
        Monster blueDragon = new Monster("Blue Dragon", 19, 225, 23);
        Monster ogre = new Monster("Ogre", 11, 59, 13);

        Monster[] monsters = {orc, blueDragon, ogre};

        for(Monster monster : monsters){
            System.out.println(monster);
            System.out.println("The " + monster.getName() + " does " + monster.getDamage() + " points of damage");
        }

        String result = ogre.attack(orc);
        System.out.println(result);


    }
}
