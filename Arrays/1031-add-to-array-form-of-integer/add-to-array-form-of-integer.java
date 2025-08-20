import java.util.*;
import java.math.BigInteger;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        for (int n : num) {
            sb.append(n);
        }

        BigInteger bigNum = new BigInteger(sb.toString());
        BigInteger sum = bigNum.add(BigInteger.valueOf(k));

        for (char c : sum.toString().toCharArray()) {
            list.add(c - '0');
        }

        return list;
    }
}
