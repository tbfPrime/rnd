class TypePromotionDemo{
    public static void main(String args[]){
        System.out.println("Program to demo Type promotions in Java.");
        byte b = 42; 
        short s = 1033;
        int i = 200;
        long l = 2222;
        
        char c = 'Y';
        boolean boolVal = true;
        
        float f = 101.23f;
        double d = 323.432; 

        double result = (f * b) + (i / c) - (d * s);
        System.out.println("Value of result: " + result);
    }
}
