public class EnumExample {
    public enum Color {
        RED, GREEN, BLUE;
    }

    public static void main(String[] args) {
        Color myColor = Color.RED;

        switch (myColor) {
            case RED:
                System.out.println("The color is Red.");
                break;
            case GREEN:
                System.out.println("The color is Green.");
                break;
            case BLUE:
                System.out.println("The color is Blue.");
                break;
            default:
                System.out.println("Unknown color.");
        }
    }
}

