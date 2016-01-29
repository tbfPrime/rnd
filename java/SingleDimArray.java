class SingleDimArray{
    public static void main(String args[]){
        System.out.println("Program to demo Single dimensional arrays.");

        double dataSet[] = {10.0, 13, 23.5, 12, 14.5};
        double avg = 0;

        for(int i = 0; i < dataSet.length; i++){
            avg += dataSet[i];
        }
        System.out.println("Value of average is " + avg/dataSet.length);
    }
}
