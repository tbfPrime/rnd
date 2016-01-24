class HypotenuseDemo{
    public static void main(String args[]){
        System.out.println("Program to demo dynamic initialization.");
        double x = 10, y = 20;
        System.out.println("Value of x: " + x + ", y: " + y);

        double c = Math.sqrt(x*x + y*y);
        System.out.println("Value of Hypotenuse is: " + c);
    }
}
