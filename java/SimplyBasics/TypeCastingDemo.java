class TypeCastingDemo{
    public static void main(String args[]){
        System.out.println("Program to demo TypeCasting.");

        int iValue;
        byte bValue;
        double dValue;
        
        iValue = 509;
        bValue = -126;
        dValue = 320.234;

        System.out.println("Cast int: " + iValue + " to byte: " + (byte)iValue);
        System.out.println("Cast double: " + dValue + " to int: " + (int)dValue);
        System.out.println("Cast double: " + dValue + " to byte: " + (byte)dValue);
    }
}
