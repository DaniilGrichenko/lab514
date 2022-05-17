import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        String eqq[] = new String[2];
        for (int i = 0; i < 2; i++) {
            Scanner sc = new Scanner(System.in);
            eqq[i] = sc.nextLine();

        }if (eqq[0].length()>eqq[1].length()){
            System.out.println(eqq[0]+" Більше");

        }else if (eqq[1].length()>eqq[0].length()){
            System.out.println(eqq[1]+" Більше");

        }else {
            System.out.println("Рядки однакові за довжиною");
        }
    }
}



