class ScopeDemo{
    public static void main(String args[]){
        System.out.println("Program to demo Scope of Variables.");
        int x = 10;
        System.out.println("The Value of x is " + x);

        if(x < 20){
            int y = 20;
            System.out.println("Inner Value of x is " + x + " and y is " + y); 
        }
//            System.out.println("Outer Value of x is " + x + " and y is " + y); 
            System.out.println("Outer Value of x is " + x);
    }
}
