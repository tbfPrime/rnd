class SampleMenuDemo{
    public static void main(String args[])
        throws java.io.IOException{
            System.out.println("Program to demo Sample Menu System using While loop.");

//            char choice;
            int option;
            System.out.println("Inside IOException.");
            do{
                System.out.println("==== Menu ===");
                System.out.println("1. Print Mumbai.");
                System.out.println("2. Print Chennai.");
                System.out.println("3. Print Kolkata.");
                System.out.println("4. Print Delhi.");
                System.out.println("5. Quit.");
                System.out.print("\n=== Select one option: ");

//                choice = (char)System.in.read();
                option = System.in.read();

                System.out.println("Value of option is: " + option);
                switch(option){
                case 1: System.out.println("\nMumbai\n"); break;
                case 2: System.out.println("\nChennai\n"); break;
                case 3: System.out.println("\nKolkata\n"); break;
                case 4: System.out.println("\nDelhi\n"); break;
                case 5: System.out.println("\nGoodBye."); break;
                default: System.out.println("\nInvalid option. Please try again.\n"); break;
            }
            } while(option != 5);
        }
}
