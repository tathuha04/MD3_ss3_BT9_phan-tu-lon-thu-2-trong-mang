public class Main {
    public static void main(String[] args) {
        int [] arr=  {6,4,5,1,2,3,4,3,2};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ "\t");
        }
        int max1 = arr[0];
        int max2= arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (max1<arr[i]){
                max2=max1;
                max1= arr[i];
            }
            else if (max1 > arr[i]&& max2<arr[i]) {
                max2= arr[i];
            }
        }
        System.out.println("\nSố lớn nhất trong mảng là "+ max1);
        System.out.println("Số lớn thứ 2 trong mảng là "+ max2);
    }
    }
