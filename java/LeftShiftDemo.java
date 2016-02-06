class LeftShiftDemo{
    public static void main(String args[]){
        System.out.println("Program to demo LeftShift operator.)");

        int a = 2;
        for(int i = 0; i < 4; i++){
            System.out.println("Value of a is: " + (a <<= 1));
        }
    }
}
