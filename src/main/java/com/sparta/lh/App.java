package com.sparta.lh;
//written by Lee

public class App 
{
    public static void main( String[] args ) {
        int timeOfDay = 10;
        String welcomeMessage = greeting(timeOfDay);
        System.out.println(welcomeMessage);
    }

    public static String greeting(int timeOfDay) {
        String message;
        if (timeOfDay >=5 && timeOfDay <=11) {
           message = "Good Morning!";
        } else if (timeOfDay >=12 && timeOfDay <=18){
            message = "Good Afternoon!";
        } else if (timeOfDay >=19 && <=23){
            message = "Good Evening!";
        } else if (timeOfDay >=0 && <=4){
            message = "Good Night!";
            else {
                message = "Invalid, please try again...";
            }
        }

        return message;
    }
}
