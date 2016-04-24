class BlockTest{
    public static void main(String args[]){
        System.out.println("This is a sample program to test block of code.");
        int x, y;
        x = 10;
        y = 20;

        for(int i = 0; i < y; i++){
            System.out.println("Value of i: " + i);
            x = x * i;
            System.out.println("Value of i: " + i + " x: " + x + " y: " + y);
        }
    }
}
