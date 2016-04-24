class ForEachDemo{
    public static void main(String args[]){
        System.out.println("Program to demo for each in Java.");

        int a[][] = new int[5][5];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = i*j;
            }
        }

        for(int x[]: a){
            for(int y: x){
                //y *= 10;
                System.out.println("Value of y is " + y);
            }
        }
    }
}
