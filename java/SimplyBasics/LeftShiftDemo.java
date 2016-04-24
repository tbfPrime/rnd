class LeftShiftDemo{
    public static void main(String args[]){
        System.out.println("Program to demo LeftShift operator.)");

        int a = 2;
        byte b = (byte)0x80;
        System.out.println("Value of byte is: " + b);
        for(int i = 0; i < 34; i++){
            System.out.println(i + " - Value of a is: " + (a <<= 1));
        }
    }
}
