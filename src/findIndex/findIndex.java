package findIndex;
public class findIndex {

    public static int strStr(String haystack, String needle) {

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            int j = 0;

            while (j < needle.length()
                    && haystack.charAt(i + j) == needle.charAt(j)) {

                j++;
            }

            if (j == needle.length()) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        String haystack1 = "sadbutsad";
        String needle1 = "sad";

        int resultado1 = strStr(haystack1, needle1);

        System.out.println("Resultado 1: " + resultado1);

        String haystack2 = "leetcode";
        String needle2 = "leeto";

        int resultado2 = strStr(haystack2, needle2);

        System.out.println("Resultado 2: " + resultado2);

    }
}