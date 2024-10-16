package codility.nbb;

public class BalanceStringPivotNAB {

    public int solution(String str) {
        char[] chars = str.toCharArray();
        int numberOfXCount = 0;
        int numberOfYCount =0 ;
        for (char character : chars){
            if (character == 'x') {
                numberOfXCount++;
            } else  {
                numberOfYCount++;
            }
        }
        int activeXCount = 0;
        int activeYCount = 0;
        int breakingIndex = 0;

        for (int i =0 ; i < chars.length ; i++) {
            if (chars[i] == 'x') {
                activeXCount++;
            } else  {
                activeYCount++;
            }
            if (activeXCount == (numberOfYCount - activeYCount)) {
                breakingIndex = i+1;
                break;
            }
        }
        return breakingIndex;

    }

    public static void main(String[] args) {
        System.out.println(new BalanceStringPivotNAB().solution("xyxyxy"));// should return 3 index+1
        System.out.println(new BalanceStringPivotNAB().solution("xxxxyxxyx"));// should return 2 index+1
        System.out.println(new BalanceStringPivotNAB().solution("xxxxyxxyyx"));// should return 2 index+1
    }
}
