package Day4_Strings;
public class NullPointer {
    public static void generateNullPointer() {
        String text = null;
        System.out.println("Length of the string: " + text.length());
    }
    public static void handleNullPointer() {
        String text = null;
        try {
            System.out.println("Length of the string: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException!");
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        handleNullPointer();
    }
}
