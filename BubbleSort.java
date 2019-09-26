
public class BubbleSort {
  public static void main(String[] args) {
    int[] newArray = new int[10];
    for (int i = 0; i < newArray.length; i++) {
      newArray[i] = (int) (Math.random() * 100);
    }
    printArray(newArray);
    int[] res = getSort(newArray);
    printArray(res);
  }
  
  public static int[] getSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          int miner = arr[i];
          arr[i] = arr[j];
          arr[j] = miner;
        }
      }
    }
    return arr;
  }
  
  public static void printArray(int[] arr) {
    System.out.print("[");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + ", ");
    }
    System.out.println("]");
  }
}
