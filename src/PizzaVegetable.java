public class PizzaVegetable extends Pizza{
    @Override
    public void prepare() {
        System.out.println("Pizza Vegetable Prepare");
    }

    @Override
    public void sauce() {
        System.out.println("Pizza Vegetable Sauce");
    }

    @Override
    public void bake() {
        System.out.println("Pizza Vegetable Bake");
    }

    @Override
    public void cut() {
        System.out.println("Pizza Cheese Cut");
    }

    @Override
    public void box() {
        System.out.println("Pizza Vegetable Box");
    }
}
