import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputHour = sc.nextInt();
        int inputMinute = sc.nextInt();
        int settingMinute = sc.nextInt();

        inputMinute += settingMinute;

        while(inputMinute >= 60){
            inputMinute -= 60;
            inputHour += 1;
            if (inputHour > 23) {
                    inputHour -= 24;
                }
            }
        System.out.print(inputHour + " " + inputMinute);
    }
}