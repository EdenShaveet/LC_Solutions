//Solution
class Solution_1672 {
    public int maximumWealth(int[][] accounts) {
        int maxWealthSoFar = 0; //initialize a max wealth seen so far
        for(int[] customer : accounts){ //for each customer in accounts grid...
            int currentCustomerWealth = 0; // initialize a current wealth to 0

            for(int bank : customer){ //for each bank in customer array...
                currentCustomerWealth += bank; //add current wealth value + the value in the bank
            }

            maxWealthSoFar = Math.max(maxWealthSoFar, currentCustomerWealth);
        }

        return maxWealthSoFar;
    }


    //Main method
    public static void main(String[] args) {
        Solution_1672 solution = new Solution_1672();
        
        int[][] accounts = {
            {1, 2, 3},  //6
            {3, 2, 1},  //6
            {4, 3, 2}   //9
        };
        
        int result = solution.maximumWealth(accounts);
        
        System.out.println("The richest customer has a wealth of: " + result);
    }
}
