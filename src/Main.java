import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Professor p1 = new Professor("123");
        int tentativas = 0;

        while (tentativas <4){
            System.out.println("senha:");
            p1.setSenha(sc.next());

            if (p1.getSenha().equals("123")){
                tentativas = 4;
            }
            tentativas++;

            if (tentativas < 3 ){
                System.out.println("tente novamente");
            }
            else if(tentativas == 3){
                System.out.println("você foi desconectado por excesso de tentativas");
                System.exit(0);
            }
            else {
                System.out.println("Você foi logado com sucesso!");;
            }
        }
        System.out.println("qual forma você deseja cadastrar:" +
                "\n 1- Quadrado" +
                "\n 2- Circulo" +
                "\n 3- Retângulo");
        int escolha = sc.nextInt();

        switch (escolha){
            case 1:
                
                break;
        }
    }
}
