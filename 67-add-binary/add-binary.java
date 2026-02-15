class Solution {
    public String addBinary(String a, String b) {
      int i=a.length()-1;
      int j=b.length()-1;
      int c=0;
       StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0) {
            int sum = c;

            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';

            result.append(sum % 2);
            c = sum / 2;
        }

        if (c == 1) {
            result.append(1);
        }

        return result.reverse().toString();
    }
}