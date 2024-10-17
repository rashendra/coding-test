package codility.leetcode;

public class FirstOccurenaceOfString {

    public int strStr(String haystack, String needle) {
        System.out.println(haystack.indexOf(needle));
        return haystack.indexOf(needle);
       /* String[] hayStackArray = haystack.split(needle);
        if (hayStackArray == null || hayStackArray.length == 0) {
            return -1;
        } else {
            return haystack.indexOf(needle);
        }*/

    }

    public static void main(String[] args) {
        System.out.println(new FirstOccurenaceOfString().strStr("sadbutsad","sad"));
        System.out.println(new FirstOccurenaceOfString().strStr("leetcode","leeto"));

    }


}
