public class WaterMax {
    public static void main(String[] args) {
        int[] list = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int max = getmax(list);
        System.out.println(max);
    }

    static int getmax(int[] list) {
        int left = 0,right= list.length-1;
        int temp = 0;
        int maxArea = 0;
        while(left<right){
            if(list[left]<list[right]){
            maxArea =Math.max(list[left]*(right-left),maxArea);
            left++;
            }else{
               maxArea = Math.max(list[right]*(right-left),maxArea);
               right--;
            }
        /*for (int i = 0; i < list.length; i++) {
            for (int i1 = i + 1; i1 < list.length; i1++) {
                if (list[i] < list[i1]) {
                    area = list[i] * (i1 - i);
                } else {
                    area=list[i1]*(i1-i);
                }
                if (area > temp) {
                    temp = area;
                }
            }*/
        } return maxArea;
    }
}

