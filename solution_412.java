//Solution
import java.util.ArrayList;
import java.util.List;

class Solution_412{
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>(n);

        for(int i=1; i<=n; i++){
            if(i%3==0 && i%5==0){
                answer.add("FizzBuzz");
            }else if(i%3==0){
                answer.add("Fizz");
            }else if(i%5==0){
                answer.add("Buzz");
            }else{
                answer.add(String.valueOf(i));
            }
        }
        return answer;
    }


    //Main method
    public static void main(String[] args) {
        Solution_412 solution = new Solution_412();
        int n = 3;
        List<String> result = solution.fizzBuzz(n);

        System.out.println(result);
    }
}