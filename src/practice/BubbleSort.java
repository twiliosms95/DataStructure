package practice;

public class BubbleSort {

    public static void main(String[] args) {
        //sorting
        int[] x = {1,2,3,4,1,2,3,4,5};
        for (int i=0;i<x.length;i++){
            for(int j=0;j<x.length-1;j++) {
                if(x[j]>x[j+1]){
                    int temp;
                    temp = x[j];
                    x[j] = x[j+1];
                    x[j+1]= temp;
                }
            }
        }
        //removing
        int j=0;
        int[] temp=new int[x.length-1];
        for(int i=0;i<x.length-1;i++){
            if(x[i]!=x[i+1]){
                temp[j]=x[i];
                j++;
                // 22 2 3
            }
            temp[j]=x[i+1];
        }
        //printing
        for (int t:temp){
            if(t==0)
                break;
            System.out.println(t);
        }

    }
}
