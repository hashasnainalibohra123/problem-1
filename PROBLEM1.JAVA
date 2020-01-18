Problem 1-> 

Test Case 1 : 0  ( should be handlend )

Test Case 2 : 12345  ( +ive use case )

Test Case 3 : input = Math.Pow(2, 32) ( end point validation case )

Test Case 4 : -7 ( -ive use case if any )


code -> 

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        int input = 78787878;

        List<List<Integer>> result = possiablePermutationWithMaxLengthTwo(input);

        // map result with Upper-case alphabets
        System.out.print(result);
    }

    private static List<List<Integer>> possiablePermutationWithMaxLengthTwo(int input) {
        List<List<Integer>> res = new ArrayList<>();

        //  Find all possiable permuations with maximun two digits
        // no number combo should be greater then 26

        return res;
    }
}
