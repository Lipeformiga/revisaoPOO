import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Banco b1 =new Banco();

        login();

        while (true){
            System.out.println("O que deseja fazer: " +
                    "\n 1- Cadastrar Quadrado" +
                    "\n 2- Cadastrar Circulo" +
                    "\n 3- Cadastrar Retângulo" +
                    "\n 4- Ver lista de Quadrados" +
                    "\n 5- Ver lista de Circulos" +
                    "\n 6- Ver lista de Retângulos" +
                    "\n 7- Ver lista de todas as formas criadas");
            int escolha = sc.nextInt();

            switch (escolha){
                case 1:
                    cadastroQuadrado();
                    break;

                case 2:
                    cadastroCirculo();
                    break;

                case 3:
                    cadastroRetangulo();
                    break;

                case 4:
                    for (Formas quadrado : Banco.getFormas()){
                        if (quadrado.getClass().getName().equals("Quadrado")){
                            System.out.println(quadrado.toString());
                        }
                    }
                    break;

                case 5:
                    for (Formas circulo : Banco.getFormas()){
                        if (circulo.getClass().getName().equals("Circulo")){
                            System.out.println(circulo.toString());
                        }
                    }
                    break;

                case 6:
                    for (Formas retangulo : Banco.getFormas()){
                        if (retangulo.getClass().getName().equals("Retangulo")){
                            System.out.println(retangulo.toString());
                        }
                    }
                    break;
                case 7:
                    for (Formas forma : Banco.getFormas()){
                            System.out.println(forma.toString());

                    }

            }
        }

    }
    static void cadastroCirculo(){

        System.out.println("raio do circulo: ");
        Circulo c1 = new Circulo(sc.nextDouble());
        Banco.addForma(c1);
    }
    static void cadastroQuadrado(){

        System.out.println("lado do quadrado: ");
        Quadrado q1 = new Quadrado(sc.nextDouble());
        Banco.addForma(q1);
    }

    static void cadastroRetangulo(){

        System.out.println("Lado 1:");
        double lado1 = sc.nextDouble();
        System.out.println("Lado 2:");
        Retangulo r1 = new Retangulo(lado1,sc.nextDouble());
        Banco.addForma(r1);
    }

    static void login(){
        int tentativas = 0;
        while (tentativas <4){
            Professor p1 = new Professor("123");
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
    }
}
