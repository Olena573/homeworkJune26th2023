public class ClassForTaskTwo {

    public static void main (String [] args){
        System.out.println(Time.Dinner.getValue());
    }

   enum Time {
        Breakfast("Time for breakfast is at morning, when you woke up."),
        Lunch("Time for Lunch can be from 12:00 or 13:00 to 13:00 or 14:00. Europeans call it Dinner. "),
        Dinner("Time for Dinner can be from 18:00 or 19:00 to 19:00 or 20:00. "),
        Supper("Supper is an evening meal. It goes after dinner. It can be between 17:00 and 22:00."),
       Tea("Also when it is required, you can make yourself a tea.");
       final String time;

        Time(String time){
            this.time = time;
        }

        public String getValue(){
            return time;
        }

    }

}
