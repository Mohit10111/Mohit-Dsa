class Solution {
    public int divisorSubstrings(int num, int k) {
        int count =0 ;
        String s = String.valueOf(num);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<k; i++){
            sb.append(s.charAt(i));
        }
        int n = Integer.parseInt(sb.toString());

            if(n != 0 && num % n == 0) count++;

        for(int i = k; i<s.length(); i++){
            sb.deleteCharAt((0));
            sb.append(s.charAt(i));
            

            n = Integer.parseInt(sb.toString());

            if(n !=0 && num % n == 0) count++;
        }

        return count;
    }
}