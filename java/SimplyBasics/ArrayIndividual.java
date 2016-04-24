class ArrayIndividual{
    public static void main(String args[]){
        System.out.println("Program to Individually allocate Array Size.");

        int displayArray[][] = new int[3][];
        displayArray[0] = new int[1];
        displayArray[1] = new int[2];
        displayArray[2] = new int[3];
        int counter = 0;

        for(int i = 0; i < displayArray.length; i++){
            for(int j = 0; j < displayArray[i].length; j++){
                displayArray[i][j] = ++counter;
                System.out.print("[" + displayArray[i][j] + "]");
            }
            System.out.println();
        }
    }
}
