class Dish {
    private int costInCents;
    private String nameOfDish;
    private Boolean wouldRecommend;
    private static int totalDishes = 0;
    private static int discountPercent = 0;

    public String printSummary() {
        return  "\nCost: " + costInCents +  "\n"+
                "Name: " + nameOfDish + "\n" +
                "Recommend: " + wouldRecommend + "\n";
    }
    public void setnameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }
    public String getnameOfDish() {
        return nameOfDish;
    }
    public void setcostInCents(int costInCents) {
        this.costInCents = costInCents;
    }
    public int getcostInCents() {
        return costInCents;
    }
    public void setWouldRecommend(Boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

    public Boolean getWouldRecommend() {
        return wouldRecommend;
    }
    public Dish(String nameOfDish, Boolean wouldRecommend, int costInCents) {
        this();
        this.nameOfDish = nameOfDish;
        this.costInCents = costInCents;
        this.wouldRecommend = wouldRecommend;
    }
    }


//    public void setnameOfDish(String title) {
//        this.nameOfDish = nameOfDish;
//    }
//    public String getnameOfDish() {
//        return nameOfDish;
//    }


public class MiniAssignmentPT1 {
    //main and tab
    public static void main(String[] args) {
        Dish dish1 = new Dish();
        System.out.println("dish1 = " + dish1.printSummary());
        
        dish1.nameOfDish = "Beef Stew";
        dish1.costInCents = 500;
        dish1.wouldRecommend = true;

        System.out.println("dish1.printSummary() = " + dish1.printSummary());
    }
}

