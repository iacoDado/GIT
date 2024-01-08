import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in;
        int hourIn, minuteIn, secondIn, secAdd;

        in=new Scanner(System.in);

        System.out.print("Insert the number of initial hours: ");
        hourIn=in.nextInt();

        System.out.print("Insert the number of initial minutes: ");
        minuteIn=in.nextInt();

        System.out.print("Insert the number of initial seconds: ");
        secondIn=in.nextInt();

        System.out.print("Insert the number of seconds to add: ");
        secAdd=in.nextInt();

        Time time_obj=new Time(hourIn, minuteIn, secondIn);

        System.out.println("Starting time: "+time_obj.toString());

        time_obj.addSeconds(secAdd);
        System.out.println("Final time: "+time_obj.toString());

        System.out.println("Seconds from midnight: "+time_obj.secFromMidnight());
    }
}