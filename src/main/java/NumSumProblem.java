public class NumSumProblem {
	
    public static boolean sumOfNumbers(int num1, int num2, int sum){
        if(sum == num1+num2)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        int[] num = {1,3,4,2,5,6,6,9,12};
        int sum=5;
        int start=0;
        int end=start+1;
        while(start < num.length){
            if(sumOfNumbers(num[start],num[end],sum)){
                System.out.println("The numbers are :: " + num[start] +" :: "+num[end]);
                break;
            }
            end++;
            if(end == num.length){
                start++;
                end = start+1;
            }

        }
    }
}