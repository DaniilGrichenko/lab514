import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args){
        String eqq[] = new String[5];
        System.out.println("Ведіть 5 слів");

        for(int i = 0;i<5;i++){
            Scanner sc = new Scanner(System.in);
            eqq[i] = sc.nextLine();
        }
        System.out.print(eqq[0].concat(" " + eqq[1]).concat(" " + eqq[2]).concat(" " + eqq[3]).concat(" " + eqq[4]));

    }
}
