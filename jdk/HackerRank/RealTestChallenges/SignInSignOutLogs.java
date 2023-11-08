package jdk.HackerRank.RealTestChallenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class SignInSignOutLogs {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int logsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> logs = IntStream.range(0, logsCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        int maxSpan = Integer.parseInt(bufferedReader.readLine().trim());

        System.out.println(processLogs(logs, maxSpan));



        bufferedReader.close();
    }

    /*
     * Complete the 'processLogs' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY logs
     *  2. INTEGER maxSpan
     */
    public static List<String> processLogs(List<String> logs, int maxSpan) {
        // Write your code here
        List<String> resultList = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();

        int length = logs.size();
        int maxMinutes = 0;
        String[] logDetails = new String[3];
        String key = "";
        String value = "";
        for(int i = 0; i < length; i ++){
            logDetails = logs.get(i).split(" ");

            key = logDetails[0];
            value = logDetails[1];

            if(map.get(key) == null){
                map.put(key,Integer.parseInt(value));
                continue;
            }
            maxMinutes = Integer.parseInt(value) - map.getOrDefault(key,0);
            if(maxSpan >= maxMinutes){
                resultList.add(key);
            }
        }

        return resultList;
    }

}
