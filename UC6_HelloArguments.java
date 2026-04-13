public class UC6_HelloArguments {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello");
            return;
        }

        StringBuilder message = new StringBuilder("Hello ");
        String delimiter = ", ";

        for (String arg : args) {
            message.append(arg).append(delimiter);
        }
        String finalMessage = message.substring(0, message.length() - delimiter.length());

        System.out.println(finalMessage);
    }
}