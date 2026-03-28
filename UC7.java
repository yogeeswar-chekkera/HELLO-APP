public class HelloApp {

    public static void main(String[] args) {

        // Check if arguments are provided
        if (args.length == 0) {
            // Default message
            System.out.println("Hello, World!");
        } else {
            // Join all arguments with comma and space
            String names = String.join(", ", args);

            // Display greeting
            System.out.println("Hello, " + names + "!");
        }
    }
}
