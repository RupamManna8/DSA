package ArrayStrings.Day20;

public class FlipImage {
    public void reverseAndFlip(int arr[]){
        int last = arr.length - 1;
        int first = 0;
        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            arr[first] = arr[first] ^ 1;
            arr[last] = arr[last] ^ 1;
            first++;
            last--;
        }

    }
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            reverseAndFlip(image[i]);
        }
        return image;
    }
    public static void main(String[] args) {
        int data[][] = {{1,1,0},{1,0,1},{0,0,0}};
        
        System.out.println(data);
    }
}
