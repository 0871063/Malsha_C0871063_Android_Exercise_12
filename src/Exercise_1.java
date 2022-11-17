
import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert array count : ");
        int arrayCount = scanner.nextInt();

        int[] numberArray = new int[arrayCount];

        for (int i = 0 ; i< numberArray.length; i++){
            System.out.println("Please insert a number : ");
            numberArray[i] = scanner.nextInt();
        }
        if (numberArray.length == 0){
            System.out.println("Table is empty.\n");
        }else {

            int count = 1;
            int tempCount;
            int number = numberArray[0];
            int temp ;

            for (int i = 0; i < (numberArray.length - 1); i++)
            {
                temp = numberArray[i];
                tempCount = 0;
                for (int j = 1; j < numberArray.length; j++)
                {
                    if (temp == numberArray[j])
                        tempCount++;
                }
                if (tempCount > count)
                {
                    number = temp;
                    count = tempCount;
                }
            }

            System.out.println("The most frequent number in the table is:");
            System.out.printf("%d ( %d x )" , number, count);
        }

    }
}
