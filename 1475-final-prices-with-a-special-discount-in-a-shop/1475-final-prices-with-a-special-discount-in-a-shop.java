class Solution {
    public int[] finalPrices(int[] prices) {
        // int n = prices.length;
        // int ans[] = new int[n];

        // for(int i =0; i<n; i++){
        //     int curr = prices[i];
        //     ans[i] = curr;
        //     for(int j = i+1; j<n; j++){
        //         if(prices[j] <= curr){
        //             ans[i] = curr-prices[j];
        //             break;
        //         }
        //     }
        // }
        // return ans;
        int n = prices.length;

        int ans[] = prices.clone();
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i<n; i++){
            while(!st.isEmpty() && prices[i] <= prices[st.peek()]){
                int idx = st.pop();
                ans[idx] = prices[idx] - prices[i];
            }

            st.push(i);
        }
        return ans;
    }
}