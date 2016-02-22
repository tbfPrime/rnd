class ForDemo{
    public static void main(String args[]){
        System.out.println("Program to demo for loop.");

        int i = 0;
        for(;;){
            System.out.println("Value of i is: " + (i++));
            if(i > 100000){ break; }
        }
    }
}
