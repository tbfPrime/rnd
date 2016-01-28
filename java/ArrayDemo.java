class ArrayDemo{
    public static void main(String args[]){
        System.out.println("Program to demo Array in Java.");
        
        int month_days[];
        month_days = new int[12]; 

        int sampleArray[] = new int[20];

        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;
        month_days[4] = 31;
        month_days[5] = 30;
        month_days[6] = 31;
        month_days[7] = 31;
        month_days[8] = 30;
        month_days[9] = 31;
        month_days[10] = 30; 
        month_days[11] = 31;
        
        System.out.println("Value of Month February is: " + month_days[1]);
    }
}
