/**
 * Created by radu on 18-Mar-17.
 */
public class exercitii {
    public static void main(String[] args) {
        int numar;
        numar=SkeletonJava.readIntConsole("Introduceti un numar:");
        if(numar>=0) {
            //aici voi calcula si afisa patratul sau
        int patrat=numar*numar;
        SkeletonJava.printConsole("Aici este patratul;"+patrat);
        }
        else
        {
            //aici voi afisa numarul cum l-am citit
            SkeletonJava.printConsole("Aici este numarul;"+numar);

        }
}




    }