class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int Mcount  = 0;

        for (int i = low; i <= high; i++) {
            int curr = i;
            int count = 0;
            int temp = curr;

            // Count digits
            while (temp > 0) {
                count++;
                temp /= 10;
            }

            if (count % 2 != 0) {
                continue; // skip odd digit numbers
            }

            int half = count / 2;
            int rightsum = 0;
            int leftsum = 0;
            temp = curr;

            // Calculate right half sum (last digits)
            for (int j = 0; j < half; j++) {
                int digit = temp % 10;
                rightsum += digit;
                temp /= 10;
            }

            // Calculate left half sum (remaining digits)
            for (int j = 0; j < half; j++) {
                int digit = temp % 10;
                leftsum += digit;
                temp /= 10;
            }

            if (leftsum == rightsum) {
                Mcount++;
            }
        }

        return Mcount;
    }
}
