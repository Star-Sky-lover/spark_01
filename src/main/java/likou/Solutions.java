package likou;

import java.nio.charset.StandardCharsets;

public class Solutions {
    public static int[] diStringMatch(String s) {
        int[] prem = new int[s.length() + 1];
        for (int i = 0; i < prem.length; i++) {
            prem[i] = i;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                if (prem[i] > prem[i + 1]) {
                    int tmp = prem[i];
                    prem[i] = prem[i + 1];
                    prem[i + 1] = tmp;
                    i -= 2;
                    if (i < -1) i = -1;
                }
            } else {
                if (prem[i] < prem[i + 1]) {
                    int tmp = prem[i];
                    prem[i] = prem[i + 1];
                    prem[i + 1] = tmp;
                    i -= 2;
                    if (i < -1) i = -1;
                }

            }
        }
        return prem;
    }

    public static int[] diStringMatch2(String s) {
        int[] prem = new int[s.length() + 1];
        int left = 0,right = s.length();
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'I') {
                prem[i] = left;
                left++;
                if (i == s.length() -1){
                    prem[i + 1] = left;
                }
            } else {
                prem[i] = right;
                right--;
                if ( i == s.length() -1) {
                    prem[i + 1] = right;
                }
            }
        }
        return prem;
    }

    public static void main(String[] args) {
        String s = "DDI";
        for (int i : diStringMatch2(s)) {
            System.out.println(i);
        }
    }
}
