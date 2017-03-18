/**
 * Created by radu on 18-Mar-17.
 */
public class exercitii2 {
    public static void main(String[] args) {
        int numar;
        numar=SkeletonJava.readIntConsole("Introduceti un numar:");
        System.out.println(1*numar);
        System.out.println(2*numar);
        System.out.println(3*numar);
        for(int i=0;i<=10;i++){
            System.out.println(i+"x"+numar+"="+i*numar);
        }
    }




}