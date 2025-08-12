class Solution {
    public int coinChange(int[] coins, int amount) {
        int max = amount + 1;

        int[] dynamicProgramming = new int[amount + 1];

        Arrays.fill(dynamicProgramming, max);
        dynamicProgramming[0] = 0;
        
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                   dynamicProgramming[i] = Math.min(dynamicProgramming[i], dynamicProgramming[i - coin] + 1);
                }
            }
        }
        
        return dynamicProgramming[amount] > amount ? -1 :dynamicProgramming[amount];
        
    }
}