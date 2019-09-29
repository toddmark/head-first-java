package algorithm;

public class BaseTransfomer {
  public static void main(String[] args) {
    printString(toHex(17));
    printString(toHex(60));
    printString(toHex(255));
    char[] test = new char[10];
    for(int x = 0; x < test.length; x++) {
      System.out.print(test[x]);
    }
  }
  
  public static char[] toHex(int num) {
    char[] arr = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
    char[] result = new char[32];
    int pos = arr.length;
    while(num != 0) {
      int temp = num & 15;
      result[--pos] = arr[temp];
      num = num >>> 4;
    }
    return result;
  }
  
  public static void printString(char[] str) {
    for(int i = 0; i < str.length; i++) {
      if (str[i] != 0) {
        System.out.print(str[i]);
      }
    }
      System.out.print("\n");
  }
}
