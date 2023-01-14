package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if ((year > 0) && (month > 0 && month < 13)){
            int a;
            if((year % 4) == 0){
                a = 1; // leap year
                if (year % 100 == 0){
                    if (year % 400 != 0){
                        a = 2;
                    }
                }
            } else {
                a = 2; // not leap year
            }
        int b;
            if(a == 1){
                b = 29;
            } else {
                b = 28;
            }
            if(month == 2){
                System.out.println(b);
            } else {
                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
                    System.out.println(31);
                } else {
                    System.out.println(30);
                }
            }
        } else {
            System.out.println("invalid date");
        }
    }
}
