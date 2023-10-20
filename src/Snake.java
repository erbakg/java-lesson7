public class Snake extends Reptile {
    @Override
    public void makeVoice() {
        System.out.println("Ssssss");
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC0D");
    }

    @Override
    public String draw3D(String material) {
        return "Змея изображена в 3D из материала " + material;
    }
}
