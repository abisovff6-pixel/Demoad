import java.util.Scanner ;
public class GitHUb {
    public void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ad:  ");
        String Name = sc.nextLine();

        System.out.println("Soyad:  ");
        String surname = sc.nextLine() ;

        System.out.println("Vezife:  ");
        String position = sc.nextLine() ;

        System.out.println("Ad : " + Name);
        System.out.println("Soyad : " + surname);
        System.out.println("Vezife : " + position);

    }
}