import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int inputH = 0;
        int inputM = 0;
        int outputH = 0;
        int outputM = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        inputH = Integer.parseInt(input[0]);
        inputM = Integer.parseInt(input[1]);


        outputH = inputH;
        outputM = inputM - 45;

        if (outputM < 0) {
            outputM = 60 + outputM;
            outputH--;
        }

        if (outputH < 0) {
            outputH = 23; 
        }


        System.out.print(outputH + " " + outputM);
    }
}
