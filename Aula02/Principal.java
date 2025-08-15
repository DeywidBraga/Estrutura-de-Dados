import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        No<String> obj1 = new No<String>("Deywid");
        //System.out.println(obj1.toString());

        No<String> obj2 = new No<String>("nao importa.");
        //System.out.println(obj2.toString());

        No<String> obj3 = new No<String>("realmente, não importa.");
        //System.out.println(obj3.toString());

        No<String> obj4 = new No<String>("e se importar?");
        //System.out.println(obj4.toString());
 
        /*
        obj3.setNextNo(obj4);
        System.out.println(obj1.toString());
        System.out.println(obj1.getNextNo().toString());
        System.out.println(obj1.getNextNo().getNextNo().toString());
        System.out.println(obj1.getNextNo().getNextNo().getNextNo().toString());
        System.out.println(obj1.getNextNo().getNextNo().getNextNo().getNextNo().toString());
        */
        System.out.println("Imprimir dados da Lista");
        No<String> aux = obj1;

        while (aux != null) {
            System.out.println(aux.toString());
            aux = aux.getNextNo();
        }
    }
}