package Builder;

public class Main {
    public static void main(String[] args) {
        Sword sword = new Sword.Builder().setColor("grey").setHandleMaterial("wood").
                setLength(1.45).setWeight(2).setPrice(87).setMaterial("metal").build();
    }
}
