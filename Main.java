import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Obter os valores de entrada para cadastro do carro de corrida
        System.out.println("Número do carro?");
        int numero = Integer.parseInt(scanner.nextLine()); //Lendo como String e convertendo pra formato numérico para evitar bug do nextLine() após leitura de número
        System.out.println("Nome do piloto?");
        String name = scanner.nextLine();
        System.out.println("Nome da equipe?");
        String equipe = scanner.nextLine();
        System.out.println("Qual velocidade máxima?");
        double vmax = Double.parseDouble(scanner.nextLine()); //Lendo como String ...
        
        //Instanciação do objeto CarroCorrida
        CarroCorrida carroCorrida = new CarroCorrida(numero, name, equipe, vmax);
    
        System.out.println(carroCorrida.status());

        //Implementação no laço while de um menu interativo
        boolean execucao = true;
        while(execucao) {

            System.out.println("1 - ligar\n2 - desligar" + 
            "\n3 - acelerar\n4 - frear\n5 - parar\nOutro para sair\n");
            int opcao = Integer.parseInt(scanner.nextLine());
            switch (opcao) {
                case 1:
                    carroCorrida.ligar();
                    break;
                case 2: 
                    carroCorrida.desligar();
                    break;
                case 3:
                    System.out.println("Acelerar quanto?");
                    double acelerar = Double.parseDouble(scanner.nextLine());
                    carroCorrida.acelerar(acelerar);
                    break;
                case 4:
                    System.out.println("Frear quanto em %?");
                    double frear = Double.parseDouble(scanner.nextLine());
                    carroCorrida.frear(frear);
                    break;
                case 5:
                    carroCorrida.parar();
                    break;
                default:
                    execucao = false;
                    break;
            }

            //Mostrando o status do carro de corrida após cada opção escolhida
            System.out.println(carroCorrida.status());
        }//while


        scanner.close(); //recomendado fechar o objeto Scanner
    }//main
}
