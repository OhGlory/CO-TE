import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int num1 = Integer.parseInt(input[0]);
        int num2 = Integer.parseInt(input[1]);
        int num3 = Integer.parseInt(input[2]);
        int win = 0;
        
        if (num1 == num2 && num1 == num3) {
            win = 10000 + (num1 * 1000);
        } else if ((num1 == num2 && num1 != num3) || (num1 != num2 && num1 == num3)) {
            win = 1000 + (num1 * 100);
        } else if (num2 == num3 && num1 != num2) {
            win = 1000 + (num2 * 100);
        } else {
            if (num1 > num3 && num1 > num2) {
               win = num1 * 100; 
            } else if (num2 > num1 && num2 > num3) {
                win = num2 * 100;
            } else {
                win = num3 * 100;
            }
        }
        System.out.print(win);
    }
}