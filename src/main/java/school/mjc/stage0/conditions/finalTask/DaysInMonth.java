package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year <= 0 || month <=0 || month >= 13) {
            System.out.println("invalid date");
        } else {
            int x;
            x = year % 400 == 0 || year % 100 != 0 && year % 4 == 0 ? 1 : 0;
            switch(month) {
                case 2:
                    if (x==1) System.out.println(29);
                    if (x==0) System.out.println(28);
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println(31);
                    break;
                case 6:
                case 4:
                case 9:
                case 11:
                    System.out.println(30);
                    break;
                default:
                    System.out.println("wrong number!");
            }
        }
    }
}
