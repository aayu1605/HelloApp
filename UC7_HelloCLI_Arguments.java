public class UC7_HelloCLI_Arguments {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello");
        } else {
            // Join multiple arguments with comma and space separator
            String names = String.join(", ", args);
            System.out.println("Hello " + names);
        }
    }
}
