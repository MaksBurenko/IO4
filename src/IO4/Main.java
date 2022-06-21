package IO4;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        String text = "";
        double sum = 0.000000;

        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader reader = new BufferedReader(isr);

        OutputStream os = System.out;
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);


        while ((text = reader.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(text);
            while (st.hasMoreTokens()) {
                try {
                    double d = Double.parseDouble(st.nextToken());
                    sum = sum + d;

                } catch (NumberFormatException e) {
                }
            }
        }
        String str = String.format("%6f", sum);
        bw.write(str);

        reader.close();
        bw.flush();
        bw.close();
    }
}
