public class HelloApp {
    public static void main(String[] args) {

        // If no arguments → default message
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Use StringBuilder to build names
        StringBuilder nameBuilder = new StringBuilder();

        // Append each name with ", "
        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }

        // Remove last ", " using substring
        String names = nameBuilder.substring(0, nameBuilder.length() - 2);

        // Print final greeting
        System.out.println("Hello, " + names + "!");
    }
}
