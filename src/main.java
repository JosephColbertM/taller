import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int btn, btnPiso = 1;
        int	a = 1;
        System.out.println("Usted se encuentra en el piso # "+ generatePerson()+ ", el elevador se encuentra en el piso #" + a);
        System.out.println("Presione el boton para llamar al elevador (numero entero)");

        Scanner call = new Scanner(System.in);
        btn = call.nextInt();

        while(btnPiso!=0){
            System.out.println("Indique el piso al que desea ir? (0 para salir del elavador)");
            Scanner b_piso=new Scanner(System.in);
            btnPiso=b_piso.nextInt();

            if(btnPiso != 0){
                if(btnPiso == a){
                    System.out.println("Usted se encuentra ya en este piso");
                }else{
                    a = btnPiso;
                    System.out.println("Usted se dirigio al piso # "+ a);
                    System.out.println("El ascensor se encuentra en el piso # "+a);
                }
            }
        }
    }

    public static int generatePerson(){
        Random random = new Random();

        int person = random.nextInt(2 + 1) + 1;
        return person;
    }
}
