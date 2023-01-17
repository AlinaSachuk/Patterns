package Builder;

public class Sword {
    private double length;
    private double weight;
    private String color;
    private String material;
    private String handleMaterial;
    private String handleType;
    private String owner;
    private double price;

    public static class Builder {
        Sword sword;

        public Builder() {
            this.sword = new Sword();
        }

        Builder setLength(double length) {
            sword.length = length;
            return this;
        }

        Builder setWeight(double weight) {
            sword.weight = weight;
            return this;
        }

        Builder setColor(String color) {
            sword.color = color;
            return this;
        }

        Builder setMaterial(String material) {
            sword.material = material;
            return this;
        }

        Builder setHandleMaterial(String handleMaterial) {
            sword.handleMaterial = handleMaterial;
            return this;
        }

        Builder setHandleType(String handleType) {
            sword.handleType = handleType;
            return this;
        }

        Builder setOwner(String owner) {
            sword.owner = owner;
            return this;
        }

        Builder setPrice(double price) {
            sword.price = price;
            return this;
        }

        Sword build() {
            return sword;
        }
    }
}
