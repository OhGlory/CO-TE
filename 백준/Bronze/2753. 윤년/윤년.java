import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int inputYear = Integer.parseInt(input);

        if(inputYear % 4 == 0){
            if(!(inputYear % 100 == 0) || (inputYear % 400 == 0)) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        } else {
            System.out.print(0);
        }

    }
}