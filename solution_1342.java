

//Solution
class Solution_1342{
    public int numberOfSteps(int num) {
        int steps = 0;
        while(num>0){
            if(num%2==0){
                num=num/2;
            }else if(num%2!=0){
                num=num-1;
            }
            steps+=1;
        }
        return steps;
    }


    //Main method
    public static void main(String[] args) {
        Solution_1342 solution = new Solution_1342();
        int num = 14;
        int result = solution.numberOfSteps(num);

        System.out.println(result);
    }
}