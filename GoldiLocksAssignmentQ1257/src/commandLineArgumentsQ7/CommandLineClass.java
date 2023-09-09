package commandLineArgumentsQ7;

public class CommandLineClass {

	public static void main(String[] args) {
		
		 // Check if any command-line arguments were provided
        if (args.length == 0) {
            System.out.println("No Command Line Arguments.....");
        } else {
            System.out.println("Command Line Arguments provided successfully.....");

            // Loop through and print each argument
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        }
	}

}
