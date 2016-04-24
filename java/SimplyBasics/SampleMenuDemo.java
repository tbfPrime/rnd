class SampleMenuDemo{
    public static void main(String args[])
        throws java.io.IOException{
            System.out.println("Program to demo Sample Menu System using While loop.");

            char choice;
            do{
                System.out.println("\n\n==== Menu ===");
                System.out.println("1. Print Mumbai.");
                System.out.println("2. Print Chennai.");
                System.out.println("3. Print Kolkata.");
                System.out.println("4. Print Delhi.");
                System.out.println("5. Quit.");
                System.out.print("\n=== Select one option: ");

                choice = (char)System.in.read();

                System.out.println("Value of choice is: " + choice);
                switch(choice){
                case '1': System.out.println("\nMumbai\n"); break;
                case '2': System.out.println("\nChennai\n"); break;
                case '3': System.out.println("\nKolkata\n"); break;
                case '4': System.out.println("\nDelhi\n"); break;
                case '5': System.out.println("\nGoodBye."); break;
                default: System.out.println("\nInvalid option: " + choice + ". Please try again.\n"); break;
                }
            } while(choice >= '1' && choice < '5');

//            choice = (char)System.in.read();

            for(int i = 0; i < 4; i++){
                choice = (char)System.in.read();
                System.out.println("Value of choice inside for is: " + choice);
            }
            System.out.println("Value of choice is " + choice);
        }
}
