import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o primeiro número: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundoúmero: ");
        int parametroDois = terminal.nextInt();

        

        try{
                contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e) {
                System.out.println("O SEGUNDO PÂRAMETRO DEVE SER MAIOR QUE O PRIMEIRO");
        }
        terminal.close();
    }


    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois){    
            throw new ParametrosInvalidosException();
        }

        int contar = parametroDois - parametroUm;
       
        for(int i = 0; i < contar; i++) {
            System.out.println("Imprimindo o número " + i);
        }

        }

    }

