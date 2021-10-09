import java.io.*;
public class app{
    public static void main (String[]args) throws IOException{
        BufferedReader buffy=new BufferedReader (new InputStreamReader (System.in));
        double age = 0.0;
        double heartRate = 0.0, heartRateDev = 0.0, heartRateRating = 0.0;
        double Weight_kg = 0.0, BMI = 0.0, BMIDev = 0.0, BMIRate = 0.0, height_cm = 0.0;
        double SPO2 = 0.0, SPO2Rating = 0.0;
        double sleep_time = 0.0;

        System.out.println ("Enter your age");
        String A = buffy.readLine();
        age = Double.parseDouble(A);
        System.out.println ("Enter your heart rate [pulse] (taken externally)");
        String B = buffy.readLine ();
        heartRate = Double.parseDouble (B);
        System.out.println ("Enter your Weight in Kilograms (taken externally)");
        String C = buffy.readLine ();
        Weight_kg = Double.parseDouble (C);
        System.out.println ("Enter your Height in cm (taken externally)");
        String D = buffy.readLine ();
        height_cm = Double.parseDouble (D);
        System.out.println ("Enter your gender, 1 - Male, 2 - Female, 3 - Other");
        String E = buffy.readLine ();
        int gender = Integer.parseInt (E);
        System.out.println ("Enter your SPO2 (taken externally)");
        String F = buffy.readLine ();
        SPO2 = Double.parseDouble (F);
        System.out.println ("Enter your sleep time in hours (taken externally)");
        String G = buffy.readLine ();
        sleep_time = Double.parseDouble (G);
        
        if (age > 18) {
            if (heartRate > 90) {
                System.out.println("Heart rate too high. Consult a doctor. Do deep breaths, exercise well, and maintain a healthy diet reducing coffee consumption");
                heartRateDev = (heartRate - 110)/10;
                heartRateRating = 8 - heartRateDev;
            }
            else if (heartRate < 60) {
                System.out.println("Heart rate too low. Consult a doctor");
                heartRateDev = (60-heartRate)/10;
                heartRateRating = 8 - heartRateDev;
            }
            else {
                System.out.println("Heart rate is healthy");
                heartRateDev = (Math.abs(heartRate-85))/10;
                heartRateRating = 10 - heartRateDev;
            }
            System.out.println(heartRateRating + " is the rating of how good your heart rate is from the average out of 10, 10 being the best heart rate, 0 being the worst");
            }
        else {
            if (heartRate > 120) {
                System.out.println("Heart rate too high. Consult a doctor. Do deep breaths and maintain a healthy diet");
                heartRateDev = (heartRate - 110)/10;
                heartRateRating = 8 - heartRateDev;
            }   
            else if (heartRate < 50) {
                System.out.println("Heart rate too low. Consult a doctor.");
                heartRateDev = (50 - heartRate)/10;
                heartRateRating = 8 - heartRateDev;
            }
            else {
                System.out.println("Heart rate is healthy");
                heartRateDev = (Math.abs(heartRate-85))/10;
                heartRateRating = 10 - heartRateDev;
            }
            System.out.println(heartRateRating + " is the rating of how good your heart rate is from the average out of 10, 10 being the best heart rate, 0 being the worst");
        }   
        
        
        if (SPO2<=94){
            System.out.println ("Your oxygen level is low. Consult a doctor");
        }
        else {
            System.out.println ("Your oxygen levels are healthy");
        }
        SPO2Rating = (SPO2-80)/2;
        System.out.println (SPO2Rating + " is the rating of how good your SPO2 is from the average out of 10, 10 being the best Blood saturation, 0 being the worst");    
        
        if (sleep_time<8) {
            System.out.println ("Your sleep time is unhealthy. Get some rest");
        }
        else {
            System.out.println ("Your sleep timings are healthy");
        }
        
        
        BMI=Weight_kg/(Math.pow((height_cm/100),2));
        System.out.println("Your BMI is "+BMI+" kg/m^2");
         if (age>20){
            if(BMI>=25.0){
                System.out.println("Your BMI is higher than recommended levels");
                BMIDev = BMI - 25;
                BMIRate = 8 - BMIDev;
            }
            if((BMI<24.9)&&(BMI>18.5)){
               System.out.println("You have a healthy BMI"); 
               BMIDev = BMI - 21.7;
               BMIRate = 10 - BMIDev;
            }
            if(BMI<18.5){
                System.out.println("Your BMI is lower than recommended levels"); 
                BMIDev = 18.5 - BMI;
                BMIRate = 8 - BMIDev;
            }
        }
        if (age<20){
            if (age>=2&&age<=10){
                if (BMI<14) {
                    System.out.println ("Your BMI is lower than recommended levels");
                    BMIDev = 14 - BMI;
                    BMIRate = 8 - BMIDev;
                }
                else if (BMI>18){
                    System.out.println ("Your BMI is higher than recommended levels");
                    BMIDev = BMI - 18;
                    BMIRate = 8 - BMIDev;
                }
                else {
                    System.out.println ("You have a healthy BMI");
                    BMIDev = BMI - 16;
                    BMIRate = 10 - BMIDev;
                }
            }
            if (age>=11&&age<=14){
                if (BMI<14.5){
                    System.out.println ("Your BMI is lower than recommended levels");
                    BMIDev = 14.5 - BMI;
                    BMIRate = 8 - BMIDev;
                }
                else if (BMI>22) {
                    System.out.println ("Your BMI is higher than recommended levels");
                    BMIDev = BMI - 22;
                    BMIRate = 8 - BMIDev;
                }
                else {
                    System.out.println ("You have a healthy BMI");
                    BMIDev = BMI - 18.25;
                    BMIRate = 10 - BMIDev;
                }
            }
            if (age>=14&&age<=20){
                if (BMI<17){
                    System.out.println ("Your BMI is lower than recommended levels");
                    BMIDev = 17 - BMI;
                    BMIRate = 8 - BMIDev;
                }
                else if (BMI>26) {
                    System.out.println ("Your BMI is higher than recommended levels");
                    BMIDev = BMI - 26;
                    BMIRate = 8 - BMIDev;
                }
                else {
                    System.out.println ("You have a healthy BMI");
                    BMIDev = BMI - 21.5;
                    BMIRate = 8 - BMIDev;
                }
            }
        }
        if (age>20){
            if(BMI>=25.0){
                System.out.println("Your BMI is higher than recommended levels");
            }
            if((BMI<24.9)&&(BMI>18.5)){
               System.out.println("You are within the healthy range"); 
            }
            if(BMI<18.5){
                System.out.println("Your BMI is lower than recommended levels"); 
            }
        }
        System.out.println(BMIRate + " is the rating of how good your Body Mass Index is from the average out of 10, 10 being the best Body Mass Index, 0 being the worst");
    }
}