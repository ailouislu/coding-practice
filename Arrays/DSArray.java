import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class DSArray {
    public static void main (String[] args) throws Exception {
        //use the following code to fetch input from console
        String line;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;

        List<List<Integer>> inputArraysList = new ArrayList<>();

        while((line=br.readLine()) != null) {
            try {
                inputArraysList.add(
                        Stream.of(line.replaceAll("[^0-9.]", "").split(" "))
                            .map(Integer::parseInt)
                            .collect(toList())
                );
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }

            if(count == 5) {
                System.out.println(hourglassSummary(inputArraysList));
                count = 0;
                continue;
            }
                count++;
        }
    }

    public static int hourglassSummary(List<List<Integer>> arr){
        int[] sums = new int[16];
        int count = 0;

        for(int i = 0; i< arr.size()-2; i++){
            for(int j = 0; j< arr.size()-2; j++){
                sums[count] = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2)
                        + arr.get(i+1).get(j+1) + arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
                count++;
            }
        }

        Arrays.sort(sums);
        return sums[sums.length-1];
    }

}