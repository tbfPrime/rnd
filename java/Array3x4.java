class Array3x4{
    public static void main(String args[]){
        System.out.println("Program to display 2D Array.");

        int aWidth = 7, aHeight = 5;
        int displayArray[][] = new int[aHeight][aWidth];
        int counter = 0;
        for(int i = 0; i < displayArray.length; i++){
            for(int j = 0; j < displayArray[i].length; j++){
                displayArray[i][j] = counter++;
            }
        }
        for(int i = 0; i < displayArray.length; i++){
            for(int j = 0; j < displayArray[i].length; j++){
                System.out.print("[" + ++displayArray[i][j] + "] ");
            }
            System.out.println();
        }
    }
}
