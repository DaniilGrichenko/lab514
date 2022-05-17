import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args){
        String eqq[] = new String[5];
        System.out.println("Ведіть 5 слів");
        for(int i = 0;i<5;i++){
            Scanner sc = new Scanner(System.in);
            eqq[i] = sc.nextLine();
        }
        for (int i = 0;i<5;i++){
            System.out.print(eqq[i].substring(0,1)+" ");
        }
    }
}
