public class NumberWar {

    public int findDifference(int numbers[]){

        int even = 0;
        int odd = 0;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] %2 == 0){
                even += numbers[i];
            }
            else{
                odd += numbers[i];
            }
        }
        return Math.abs(even - odd);
    }

    public static void main(String[] args) {

        NumberWar run = new NumberWar();

        int test1 = run.findDifference(new int[] {2, 6, 8, 21, 20, 53, 50});
        System.out.println(test1);

        int test2 = run.findDifference(new int[]{31,89,55,44,120,22});
        System.out.println(test2);

    }

}

