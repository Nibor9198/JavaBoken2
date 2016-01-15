import java.util.Scanner;

/**
 * Created by robin.boregrim on 2016-01-13.
 */
public class template {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Villken uppgift i Java Direkt, Kapitel ?");
        System.out.println("");
        System.out.println("");
        int ans = sc.nextInt();
        System.out.println("");
        if(ans == 1) {
            u1();
        }else if(ans == 2){
            u2();
        }else {
            System.out.println("Nähe, fak ju.");
            main(args);
        }
    }
    private static void u1(){

    }
    private static void u2(){

    }
}
