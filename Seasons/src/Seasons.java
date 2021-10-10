import java.util.Scanner;


public class Seasons {

    public enum Season {
        WINTER, SPRING, SUMMER, AUTUMN
    }

    public static void
    main(String[] args) {
        System.out.println("Enter your month for us to tell you which season it belongs to thanks:");
        Scanner scanner = new Scanner(System.in);
        String Month = scanner.nextLine();
        Season season;
        switch (Month) {
            case "December":
            case "January":
            case "February":
                season = Season.WINTER;
                System.out.println(season);
                break;
            case "March":
            case "April":
            case "May":
                season = Season.SPRING;
                System.out.println(season);
                break;
            case "June":
            case "July":
            case "August":
                season = Season.SUMMER;
                System.out.println(season);
                break;
            case "September":
            case "October":
            case "November":
                season = Season.AUTUMN;
                System.out.println(season);
                break;
            default:
                System.out.println("Why you do this?");
        }


    }
}
