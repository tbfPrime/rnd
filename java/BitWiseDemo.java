class BitWiseDemo{
    public static void main(String args[]){
        System.out.println("Program to demo BitWise operators in Java.");

        String binary[] = {"0000","0001","0010","0011","0100","0101","0110","0111",
                           "1000","1001","1010","1011","1100","1101","1110","1111"};
        int a = 2, b = 3;
        System.out.println(binary[a] + " | \n" + binary[b] + "\n----\n" + binary[(a | b)] + "\n\n");
        System.out.println(binary[a] + " & \n" + binary[b] + "\n----\n" + binary[(a & b)] + "\n\n");
        System.out.println(binary[a] + " ^ \n" + binary[b] + "\n----\n" + binary[(a ^ b)] + "\n\n");
        System.out.println();
    }
}
