package jdk.Testdome;

import java.util.List;
import java.util.Arrays;

public class WeightedAverage
{
    public static double mean(List<Integer> numbers, List<Integer> weights)
    {
        if(numbers == null || weights == null)
            throw new IllegalArgumentException("Arguments can not be null");
        if(numbers.size() != weights.size())
            throw new IllegalArgumentException("Arrays do not have the same length");

        Long total = 0l;
        Long totalWeights = 0l;
        for (int i = 0; i < numbers.size(); i++)
        {
            total += numbers.get(i) * weights.get(i);
            totalWeights += weights.get(i);
        }

        return (double) total / totalWeights;
    }

    public static void main(String[] args)
    {
        List<Integer> a = Arrays.asList(new Integer[] { 3, 6 });
        List<Integer> b = Arrays.asList(new Integer[] { 4, 2 });

        System.out.println(WeightedAverage.mean(a, b));
    }
}