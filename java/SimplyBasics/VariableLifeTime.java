class VariableLifeTime{
    public static void main(String args[]){
        System.out.println("Program to demo lifetime of a variable.");
        for(int i = 0; i < 3; i++){
            int y = -1;
            System.out.println("Value of y: " + y);
            y = 100;
            System.out.println("New Value of y: " + y);
        }
    }
}
