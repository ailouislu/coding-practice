package HackerRank.Sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MarkAndToys {
    public static void main (String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine()
                        .replaceAll("\\s+$", "")
                        .split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);
        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> prices = Stream.of(bufferedReader.readLine()
                        .replaceAll("\\s+$", "")
                        .split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

        System.out.println(maximumToys(prices, k));

        bufferedReader.close();
    }

    /*
     * Complete the 'maximumToys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY prices
     *  2. INTEGER k
     */
    public static int maximumToys(List<Integer> prices, int k) {
        //Sort the list from smallest to largest
        List<Integer> orderedPrices = prices.stream()
                                .sorted(Comparator
                                .comparing(Integer::intValue))
                                .collect(Collectors.toList());

        int totalPrice = 0;
        int count = 0;
        for(int price : orderedPrices){
            if ( totalPrice + price > k) break;

            totalPrice += price;
            count++;
        }

        return count;
    }

}

/***
 * Mark and Toys
 *
 * Mark and Jane are very happy after having their first child. Their son loves toys,
 * so Mark wants to buy some. There are a number of different toys lying in front of him,
 * tagged with their prices. Mark has only a certain amount to spend, and he wants to
 * maximize the number of toys he buys with this money. Given a list of toy prices and
 * an amount to spend, determine the maximum number of gifts he can buy.
 *
 * Note Each toy can be purchased only once.
 *
 * Example
 *
 * The budget is  units of currency. He can buy items that cost  for , or  for  units. The maximum is  items.
 *
 * Function Description
 *
 * Complete the function maximumToys in the editor below.
 *
 * maximumToys has the following parameter(s):
 *
 * int prices[n]: the toy prices
 * int k: Mark's budget
 * Returns
 *
 * int: the maximum number of toys
 * Input Format
 *
 * The first line contains two integers,  and , the number of priced toys and the amount Mark has to spend.
 * The next line contains  space-separated integers
 *
 * Constraints
 *
 * A toy can't be bought multiple times.
 *
 * Sample Input
 *
 * 7 50
 * 1 12 5 111 200 1000 10
 * Sample Output
 *
 * 4
 * Explanation
 *
 * Input (stdin)
 *
 * 4 7
 * 1 2 3 4
 * Expected Output
 * 3
 *
 * Input (stdin)
 *
 * 5 15
 * 3 7 2 9 4
 * Expected Output
 * 3
 *
 * He can buy only  toys at most. These toys have the following prices: .
 */