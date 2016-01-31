class ArrayInit{
    public static void main(String args[]){
        System.out.println("Program to declare and Initialize array together.");

        int[][] displayArray = {{1, 2, 3, 4},
                              {5, 6, 7, 8},
                              {9, 10, 11, 12}};
        for(int i = 0; i < displayArray.length; i++){
            for(int j = 0; j < displayArray[i].length; j++){
                System.out.print("[" + displayArray[i][j] + "]");
            }
            System.out.println();
        }
    }
}
