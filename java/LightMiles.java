class LightMiles{
    public static void main(String args[]){
        System.out.println("This is a sample program to try long type.");
        int speedOfLight;
        int days, seconds, distance;

        speedOfLight = 186000; 
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = speedOfLight * seconds;

        System.out.println("Days: " + days + " | speedOfLight: " + speedOfLight + " | seconds: " + seconds + " | distance: " + distance);
    }
}
