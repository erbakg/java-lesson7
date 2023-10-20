public class Dog extends Animal {
    @Override
    public void makeVoice() {
        System.out.println("Gav");
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC15");
    }

    @Override
    public String draw3D(String material) {
        return "Собака изображена в 3D из материала " + material;
    }
}
