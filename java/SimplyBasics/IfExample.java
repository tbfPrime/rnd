class IfExample{
    public static void main(String args[]){
        System.out.println("This is a sample program to test if statement.");
        int x, y;
        x = 10;
        y = 20;
        if(x < y){ System.out.println("x: " + x + " is less than y: " + y); }

        x *= 2;
        if(x == y){ System.out.println("x: " + x + " is equal to y: " + y); }

        x *= 2;
        if(x > y){ System.out.println("x: " + x + " is greater than y: " + y); }

        x *= 2;
        if(x == y){ System.out.println("x: " + x + " is again equal to y: " + y); }
        // So the above statement did not print.
    }
}
