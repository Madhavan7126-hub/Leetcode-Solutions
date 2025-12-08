class Solution {
    public String longestNiceSubstring(String s) {
        int len = s.length();
        String ans = "";

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                String S = s.substring(i, j);
                if (isNice(S)) {
                    if (S.length() > ans.length()) {
                        ans = S;
                    }
                }
            }
        }

        return ans;
    }

    private boolean isNice(String S) {
        int length = S.length();
        char[] arr = S.toCharArray();

        for (int k = 0; k < length; k++) {
            char c = arr[k];

            if (Character.isLowerCase(c)) {
                if (S.indexOf(Character.toUpperCase(c)) == -1)
                    return false;
            } else {
                if (S.indexOf(Character.toLowerCase(c)) == -1)
                    return false;
            }
        }
        return true;
    }
}
