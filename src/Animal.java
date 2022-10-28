public class Animal{
    // 1: Thuộc tính (Properties - Props)
    private String name;
    private String height;
    private String weight;

    // 2: Phương thức khởi tạo
    public Animal(String name, String height, String weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    // getter
    public String getName(){
        return name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    // alt + insert

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void showInfo() {
        String textName = "name: " + name;
        String textHeight = "height: " + height;
        String textWeight = "weight: " + weight;
        System.out.println("Animal\n" + textName + "\n" + textHeight + "\n" + textWeight);
    }
}
