public class F014 {
    public static void main(String[] args) {
        for(int i=32;i<=127;i++){
            System.out.print((char)i);
            if ((i-31)%16==0&&i!=127){
			    System.out.println();
            }
        }
    }
}
