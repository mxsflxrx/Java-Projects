public class currentTime {
    public static void main(String[] args){

        //Gets the current second
        long currentSecond = (System.currentTimeMillis() / 1000) % 60 ;

        //Gets the current minute
        long currentMinute = (System.currentTimeMillis() / 1000 / 60) % 60 ;

        //Gets the current hour
        long currentHour = (System.currentTimeMillis() / 1000 / 60 / 60 ) % 24 + 8 ;
        
        // Display Time
        if (currentHour >=12){
        System.out.println("TIME (12): " + (currentHour % 12 ) + ":" + currentMinute + ":" + currentSecond + " PM");
        }else{
        System.out.println("TIME (12): " + (currentHour % 12 ) + ":" + currentMinute + ":" + currentSecond + " AM");
        }
        System.out.println("TIME (24): " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT+8");
    }
}