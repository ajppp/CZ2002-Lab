import java.util.*;

public class P4{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        //get height
        System.out.println("height");
        int height = in.nextInt();

        //check for error
        if(height <= 0){
            System.out.println("Error input!!");
            in.close();
            return;
        }

        StringBuffer str = new StringBuffer();
        for(int i = 1; i <= height; i++){
            //Print AA for odd
            if(i%2 == 1){
                str.append("AA");
                System.out.println(str);
            }
            else{
                str.append("BB");
                System.out.println(str);
            }
        }

        in.close();
    }
}

