package codility.leetcode;

class ReverrseWordsInString {
   /* public String reverseWords(String s) {
        int left = 0;
        int right = s.length() - 1;
        // remove leading spaces
        while (left <= right && s.charAt(left) == ' ') ++left;

        // remove trailing spaces
        while (left <= right && s.charAt(right) == ' ') --right;
//        s.trim();

        Deque<String> d = new ArrayDeque();
        StringBuilder word = new StringBuilder();
        // push word by word in front of deque
        while (left <= right) {
            char c = s.charAt(left);

            if ((word.length() != 0) && (c == ' ')) {
                d.offerFirst(word.toString());
                word.setLength(0);
            } else if (c != ' ') {
                word.append(c);
            }
            ++left;
        }
        d.offerFirst(word.toString());

        return String.join(" ", d);
    }*/

    public String reverseWords(String s) {
        String returnString= "";
        String[] array = s.split(" ");

        for (int i = array.length -1  ; i >= 0 ; i--){
            if(!array[i].isEmpty()) {
                System.out.println("Element : "+ array[i]);
                returnString = returnString + array[i]+ " ";
            }
        }

        return returnString.trim();
    }

    public static void main(String[] args) {
        System.out.println(new ReverrseWordsInString().reverseWords("a good   example"));
    }
}