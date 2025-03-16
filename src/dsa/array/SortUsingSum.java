package dsa.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortUsingSum {
    public static int getSum(Integer x){
        int sum = 0;
        while (x>0) {
            sum = sum + x%10;
            x = x/10;
        }

        return sum;
    }

    public static void main(String[] args) {
        ArrayList <Integer> numList = new ArrayList<>();
        numList.add(10);
        numList.add(80);
        numList.add(18);
        numList.add(20);
        numList.add(60);
        numList.add(9);
        numList.add(55);

      

        Collections.sort(numList, new Comparator<Integer>() {
            
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o1 - o2);
            }
        });
        System.out.println(numList);

        Collections.sort(numList, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return getSum(o1) - getSum(o2);
            }   
        });
        System.out.println("After comparing with sum: " + numList);
    }
}
