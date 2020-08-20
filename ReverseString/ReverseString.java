
// time complex o(n)
// space complex o(1)

public class ReverseString {

    public static void main(String[] args) {

        char[] arr = {'h','e','l','l','o'};

        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = temp;
        }

        System.out.println(arr);
    }


}
