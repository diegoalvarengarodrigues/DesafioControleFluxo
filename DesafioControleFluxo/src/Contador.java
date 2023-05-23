import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        try {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        contar(parametroUm,parametroDois);
        terminal.close();

        }catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número " + (i+1));

        }
    }
}