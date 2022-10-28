public class Cat extends Animal{
    private String color;

    public Cat(String name, String height, String weight, String color) {
        super(name, height, weight);
        this.color = color;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("color: " + color);
    }
}
