class BasicArithmetics{
    public static void main(String args[]){
        System.out.println("Program to demo Basic Arithmetic operators in Java.");

        int a = 10, b = 20, c = 42;
        double da = 42.5;
        System.out.println(a + " + " + b + " is: " + (a + b));
        System.out.println(a + " - " + b + " is: " + (a - b));
        System.out.println(a + " * " + b + " is: " + (a * b));
        System.out.println(a + " / " + b + " is: " + (a / b));
        System.out.println(a + " % " + b + " is: " + (a % b));
        System.out.println(a + " ++ is: " + a++);
        System.out.println(a + " -- is: " + a--);
        System.out.println("-a is: " + -a);
        System.out.println(c + " % 10 is: " + (c % 10));
        System.out.println(da + " % 10 is: " + (da % 10));

        System.out.println(a + " += 10 is: " + (a += 10) + ". a is now: " + a);
        System.out.println(a + " -= 10 is: " + (a -= 10) + ". a is now: " + a);
        System.out.println(a + " *= 10 is: " + (a *= 10) + ". a is now: " + a);
        System.out.println(a + " /= 10 is: " + (a /= 10) + ". a is now: " + a);
        System.out.println(da + " %= 10 is: " + (da %= 10) + ". da is now: " + da);
    }
}
