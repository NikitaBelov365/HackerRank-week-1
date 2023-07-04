import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class First {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        double a = 0, b = 0, c = 0;
        int l = arr.size();
        for (Integer i : arr) {
            if (i > 0) {
                a++;
            } else if (i == 0) {
                b++;
            } else {
                c++;
            }
        }
        final DecimalFormat df = new DecimalFormat("0.000000");
        System.out.println(df.format(a / l));
        System.out.println(df.format(b / l));
        System.out.println(df.format(c / l));



        bufferedReader.close();
    }
}