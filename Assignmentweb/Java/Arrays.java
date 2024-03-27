import java.util.Scanner;
public class Arrays{
    private int[] arr;
    public Arrays(int[] arr) {
        this.arr = arr;
    }
    public int findMin() {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public int findMax() {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public int sumOfArray() {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    public boolean isExists(int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
    public void displayArray() {
        System.out.print("Array: [ "+arr[0]);
        for (int i = 1; i < arr.length; i++){
            System.out.print(" , "+arr[i]);
        }
        System.out.println( " ]");
    }
    public int indexOf(int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
    public boolean isDivisible(int divisor) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor != 0) {
                return false;
            }
        }
        return true;
    }
    public boolean isOddOfTheSum() {
        int sum = sumOfArray();
        return sum % 2 == 1;
    }
    public boolean isEvenOfTheSum() {
        int sum = sumOfArray();
        return sum % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] inputArray = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            inputArray[i] = scanner.nextInt();
        }
        Arrays calculator = new Arrays(inputArray);
        System.out.println("Min: " + calculator.findMin());
        System.out.println("Max: " + calculator.findMax());
        System.out.println("Sum: " + calculator.sumOfArray());
        System.out.print("Enter a number to check if it exists in the array: ");
        int numToCheck = scanner.nextInt();
        System.out.println("Number exists: " + calculator.isExists(numToCheck));
        calculator.displayArray();
        System.out.print("Enter a number to find its index: ");
        int numToFindIndex = scanner.nextInt();
        int check = calculator.indexOf(numToFindIndex);
        if(check == -1){
            System.out.println("not in the array");
        }
        else{
            System.out.println("Index: " +calculator.indexOf(numToFindIndex));
        }
        System.out.print("Enter a divisor to check if all numbers are divisible by it: ");
        int divisor = scanner.nextInt();
        System.out.println("All numbers are divisible: " + calculator.isDivisible(divisor));
        System.out.println("Sum is odd: " + calculator.isOddOfTheSum());
        System.out.println("Sum is even: " + calculator.isEvenOfTheSum());
          }
}