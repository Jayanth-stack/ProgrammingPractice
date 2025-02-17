// Decode String
// Leetcode Question: 394

package Leetcode.Stack;

public class DecodeString {

    public String decodeString(String s) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            if (Character.isDigit(s.charAt(i))) {
                int start = i;
                while (Character.isDigit(s.charAt(i))) {
                    i++;
                }
                int num = Integer.parseInt(s.substring(start, i));
                int count = 1;
                int j = i + 1;
                while (count != 0) {
                    if (s.charAt(j) == '[') {
                        count++;
                    } else if (s.charAt(j) == ']') {
                        count--;
                    }
                    j++;
                }
                String sub = decodeString(s.substring(i + 1, j - 1));
                for (int k = 0; k < num; k++) {
                    result.append(sub);
                }
                i = j;
            } else {
                result.append(s.charAt(i));
                i++;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        DecodeString ds = new DecodeString();
        System.out.println(ds.decodeString("3[a]2[bc]"));
        System.out.println(ds.decodeString("3[a2[c]]"));
        System.out.println(ds.decodeString("2[abc]3[cd]ef"));
    }
    
}
