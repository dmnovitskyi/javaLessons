import java.util.Locale;
import java.util.Scanner;


public class Seasons {

    public enum Season {
        WINTER, SPRING, SUMMER, AUTUMN
    }

    public static void
    main(String[] args) {
        System.out.println("Enter your month for us to tell you which season it belongs to thanks:");
        Scanner scanner = new Scanner(System.in);
        String Month = scanner.nextLine().toLowerCase(Locale.ROOT);
        Season season;
        switch (Month) {
            case "december":
            case "january":
            case "february":
                season = Season.WINTER;
                System.out.println(season);
                break;
            case "march":
            case "april":
            case "may":
                season = Season.SPRING;
                System.out.println(season);
                break;
            case "june":
            case "july":
            case "august":
                season = Season.SUMMER;
                System.out.println(season);
                break;
            case "september":
            case "october":
            case "november":
                season = Season.AUTUMN;
                System.out.println(season);
                break;
            default:
                System.out.println("Why you do this?");
        }


    }
}
