import java.util.*;

public class Lottery{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num[] = new int[8];
        for(int i=0;i<8;i++){
            num[i]=input.nextInt();
        } 
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                int temp=0;
                if(num[j]<num[i]){
                    temp=num[j];
                    num[j]=num[i];
                    num[i]=temp;
                }
            }
        }
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                for(int k=0;k<num.length;k++){
                    if(k!=i&&k!=j){
                        System.out.printf("-%d",num[k]);
                    }
                }
                System.out.println();
            }
        }
    }
}