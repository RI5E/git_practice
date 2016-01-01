/**
 * Created by MichaelFan on 1/1/2016.
 */
public class push_1 {
    public static void main (String args [])
    {
        System.out.println("This is an example");
        System.out.println("first commit ends here");
        System.out.println("second commit here");
    }

    /*
    commit 3: exercise from hw0
     */
    public void drawTriangle(int n){
        int i = 1;
        while(i <= n){
            int j = 1;
            while(j <= i){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
