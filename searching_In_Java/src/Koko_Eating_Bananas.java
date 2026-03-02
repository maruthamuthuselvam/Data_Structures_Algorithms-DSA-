public class Koko_Eating_Bananas {
    public static void main(String[] args) {
        int[] piles = {3,2,2,4,1,4};
        int hours = 3;
        System.out.println(FindtheminTime(piles, hours));
    }

    static int FindtheminTime(int[] piles, int hours) {
        int start = 1;
        int end = FindMax(piles) * 2;
        int ans = end;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (count_Hours(piles, hours, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        //ans += end/2;
        int mid1= (piles.length - 1) / 2;
        ans -= piles[mid1];
        return ans;
    }

    static int FindMax(int[] piles) {
        int max = piles[0];
        for (int i = 1; i < piles.length; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }
        return max;
    }

    static boolean count_Hours(int[] piles, int hours, int speed) {
        long time = 0;  // IMPORTANT: long, not int

        for (int pile : piles) {
            time += (pile + (long) speed - 1) / speed;  // all safe
            if (time > hours) return false;  // early exit
        }
        return time <= hours;
    }
}
