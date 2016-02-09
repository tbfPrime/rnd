class RightShiftDemo{
    public static void main(String args[]){
        System.out.println("Program to demo Right Shift operator.");

        byte a = (byte)0x80;
        System.out.println("Original Value of a is: " + a);
        //System.out.println("Value of a is: " + (a >>= 1));
        for(int i = 0; i < 5; i++){
            a = (byte) (a >>> 1);
            System.out.println("Value of a is: " + a);
        }
    }
}
