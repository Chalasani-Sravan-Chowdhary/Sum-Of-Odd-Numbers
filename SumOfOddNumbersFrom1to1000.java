public class SumOfOddNumbersFrom1to1000 {
    public static void main(String[] args) {
        int i= 1;
        int SumofOdd = 0;
        while(i<=100){
                SumofOdd = SumofOdd + i;
                i+=2;
            }
            System.out.println("The sum of all odd numbers from 1 to 100 is "+SumofOdd);
        }
    }



