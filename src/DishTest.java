
class Dish {
    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;
    private static int totalDishes = 0;
    private static int discountPercent = 0;

    public Dish() {
        totalDishes++;
    }

    public Dish(int costInCents, String nameOfDish, boolean wouldRecommend) {
        this();
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }

    public void printSummary() {

        float newCost = costInCents *  (1-( (float) discountPercent/100));
        System.out.printf(
                "\nCost: %f %n Name: %s \n Recommended: %b\n", newCost, nameOfDish, wouldRecommend);
    }




    public static void setDiscount(int currentDiscount) {
        discountPercent = currentDiscount;
    }

    public int getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public boolean isWouldRecommend() {
        return wouldRecommend;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

    public static int getTotalDishes() {
        return totalDishes;
    }

    public static int getDiscountPercent() {
        return discountPercent;
    }

    public static void setDiscountPercent(int discountPercent) {
        Dish.discountPercent = discountPercent;
    }
}

class DishTools {
    static final int AVG_COST_OF_DISH_IN_CENT = 13000;


    public static void shoutDishName (Dish dish) {
        System.out.println(dish.getNameOfDish().toUpperCase());
    }

    public static void analyzeDishCost(Dish dish) {

        // returns the string value more if the value is over the
        // set value in the constant
        String moreOrLess =
                (dish.getCostInCents() > AVG_COST_OF_DISH_IN_CENT) ? "More" : "Less";

        System.out.println( moreOrLess + " expensive than average");
    }

    public static void flipRecommendation(Dish dish) {
        dish.setWouldRecommend(!dish.isWouldRecommend());

    }

}


public class DishTest {

    public static void main(String[] args) {

        Dish.setDiscount(15);

        Dish dish1 = new Dish(); //

        // using setters to set values
        dish1.setNameOfDish("Dragon Roll");
        dish1.setCostInCents(15000);
        dish1.setWouldRecommend(true);

        DishTools.analyzeDishCost(dish1);


        DishTools.shoutDishName(dish1);
        dish1.printSummary();
        DishTools.flipRecommendation(dish1);
        dish1.printSummary();
        // use constructor to set values
        Dish dish2 = new Dish(
                10000,
                "California Roll",
                false
        );

        DishTools.shoutDishName(dish2);
        dish2.printSummary();
        DishTools.flipRecommendation(dish2);
        dish2.printSummary();
        DishTools.analyzeDishCost(dish2);
        System.out.println("Dish.totalDishes = " + Dish.getTotalDishes());


    }

}

