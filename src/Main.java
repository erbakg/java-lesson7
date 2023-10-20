public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal() {
            @Override
            public void draw() {
                System.out.println("\uD83D\uDC31");
            }

            @Override
            public String draw3D(String material) {
                return "Кошка изображена в 3D из материала " + material;
            }

            @Override
            public void makeVoice() {
                System.out.println("Myauuu");
            }
        };
        /*cat.makeVoice();
        cat.draw();*/

        Dog dog = new Dog();
        Car car = new Car();
        //    a = b
        Drawable[] drawables = {dog, cat, car, new Sparrow(), new Plane(), new Snake()};
        for (int i = 0; i < drawables.length; i++) {
            drawAll(drawables[i]);
            if (drawables[i] instanceof Animal) {
                ((Animal) drawables[i]).makeVoice(); // type casting
            }
            if (drawables[i] instanceof Flyable) {
                ((Flyable) drawables[i]).fly();
            }
        }

        int a = 8;
        System.out.println((double) a);
        double b = 7.8;
        System.out.println((int) b);
        System.out.println(Math.round(b));
        multiply(1.5, 2.4);
        multiply(3, 4);

        Integer myNumber = 6;
    }

    public static void multiply(double num1, double num2) {
        System.out.println(num1 * num2);
    }

    public static void drawAll(Drawable drawable) {
        drawable.draw();
        System.out.println(drawable.draw3D("Plastic"));
        if (drawable instanceof ColorDrawable) {
            ((ColorDrawable) drawable).drawWithColor();
        }
    }
}
