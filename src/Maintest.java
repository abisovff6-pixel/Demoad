import java.util.Scanner ;
public class Maintest {
    public static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Avtomobil markasi:  ");
        String name = sc.nextLine();

        System.out.println("Model :  ");
        String Model = sc.nextLine();

        System.out.println("At gucu :  ");
        String Guc = sc.nextLine();

        System.out.println("Marka : " + name);
        System.out.println("Model : " + Model);
        System.out.println("At gucu : " + Guc);

        sc.close();
    }
}
