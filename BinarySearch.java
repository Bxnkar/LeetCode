public class BinarySearch {
    public static int binarySearch(int numbers[], int toFind){
        int start = 0, end = numbers.length-1;
        
        while (start <= end){
            int mid = (start+end)/2;
            if (numbers[mid] == toFind){
            return mid;
        }
            if (numbers[mid] < toFind){
                start = mid + 1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14};
        int toFind = 10;
        System.out.print("The Index is: " + binarySearch(numbers, toFind));
    }
}
