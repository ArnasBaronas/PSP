public class Product {
    private String name;
    private float value;
    private float depreciationRate;
    private int weight;

    public Product(String name, float value, float depreciationRate, int weight) {
        this.name = name;
        this.value = value;
        this.depreciationRate = depreciationRate;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public float getValue() {
        return value;
    }

    public float getDepreciationRate() {
        return depreciationRate;
    }

    public int getWeight() {
        return weight;
    }


}
