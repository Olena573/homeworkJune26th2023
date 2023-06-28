import java.util.Arrays;
import java.util.Scanner;  // Import the Scanner class
import java.util.Objects;
public class ClassForTaskTwo {

    public static void main (String [] args){
        //System.out.println(Time.Dinner.getValue());
        String mealName;


        Scanner myInput = new Scanner(System.in);
        System.out.println("Hello. This program can describe different meal times." + '\n' +
                "It can describe Breakfast, Lunch, Dinner, Supper, and a short break for Tea." +'\n' +
                "Which meal time do you want it to describe?");
        String mealTime = myInput.nextLine();

        //here is an "if" statement, which works with inputs.
        if (mealTime==null){
            mealName = "Empty";
        } else if (mealTime.equals("Breakfast")){
            mealName = "Breakfast";
        } else if (mealTime.equals("Dinner")){
            mealName = "Dinner";
        } else if (mealTime.equals("Supper")){
            mealName = "Supper";
        } else if (mealTime.equals("Tea")){
            mealName = "Tea";
        }
        else if (
                (!mealTime.equals("Breakfast"))||
                        ( !mealTime.equals("Dinner"))||
                        ( !mealTime.equals("Supper"))||
                        (!mealTime.equals("Tea"))

                ){
            mealName = "else"; //this part of code continues to work instead of all other
        }
        else {
            mealName = "SomeMeal";
        }


        //Here is an "if" statement, which works with our "enum" value.
        if (mealName == "Empty"){
            System.out.println("Please type, description of which meal time do you need?");
        }
        else if (mealName == "Breakfast") {
            System.out.println(Time.Breakfast.getValue());
        } else if (mealName == "Lunch"){
            System.out.println(Time.Lunch.getValue());
        } else if (mealName == "Dinner"){
            System.out.println(Time.Dinner.getValue());
        } else if (mealName == "Supper"){
            System.out.println(Time.Supper.getValue());
        } else if (mealName == "Tea"){
            System.out.println(Time.Tea.getValue());
        } else if (mealName == "SomeMeal"){
            System.out.println(Time.SomeMeal.getValue());
        } else if (mealName == "else"){
            System.out.println ("You have typed something out of the list of meals times." + '\n' +
                    "If you are tired, you can take a rest. " + '\n' +
                    "If you are hungry, eat something nutricious." + '\n' +
                    "If you are thirsty, drink some tea.");
        }else{
            System.out.println ("This is an unexpected input.");
        }

        System.out.println (Arrays.toString(Time.values()));

    }

   enum Time {
        //Here is an enum "Time" with description of Breakfast, Lunch, Dinner, and Supper Time.
        Breakfast("Time for breakfast is at morning, when you woke up."),
        Lunch("Time for Lunch can be from 12:00 or 13:00 to 13:00 or 14:00. Europeans call it Dinner. "),
        Dinner("Time for Dinner can be from 18:00 or 19:00 to 19:00 or 20:00. "),
        Supper("Supper is an evening meal. It goes after dinner. It can be between 17:00 and 22:00."),
       SomeMeal("If it is needed and you are hungry, you can eat a meal."),
       Tea("When it is required, you can make yourself a tea.");
       final String time;

        Time(String time){
            this.time = time;
        }

        public String getValue(){
            return time;
        }

    }

}
