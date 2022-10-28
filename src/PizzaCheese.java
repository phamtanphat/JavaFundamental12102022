public class PizzaCheese extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Pizza Cheese Prepare");
    }

    @Override
    public void sauce() {
        System.out.println("Pizza Cheese Prepare");
    }

    @Override
    public void bake() {
        System.out.println("Pizza Cheese Bake");
    }

    @Override
    public void cut() {
        System.out.println("Pizza Cheese Cut");
    }

    @Override
    public void box() {
        System.out.println("Pizza Cheese Box");
    }
}
