class Array3D{
    public static void main(String args[]){
        System.out.println("Program to demo 3D Array.");

        int[][][] displayArray = new int[3][4][5];
        int counter = 0;
        for(int i = 0; i < displayArray.length; i++){
            for(int j = 0; j < displayArray[i].length; j++){
                for(int k = 0; k < displayArray[i][j].length; k++){
                    displayArray[i][j][k] = counter++;
                    System.out.print("[" + displayArray[i][j][k] + "]");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
