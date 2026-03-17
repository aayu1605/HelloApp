public class UC3_HelloApp_CLI_2 {
    public static void main(String[] args) {
        String name = "World"; // Default name
        if (args.length > 0) {
            name = args[0];
        }
        System.out.println("Hello, " + name + "!");
    }
}