
public class CarroCorrida {

    //Atributos
    private int numeroCarro;
    private String nomePiloto;
    private String nomeEquipe;
    private double velocidadeMaxima;
    private double velocidadeAtual;
    private boolean ligado;

    //Método construtor - versão com 4 parâmetros
    public CarroCorrida(int numeroCarro, String nomePiloto, String nomeEquipe, double velocidadeMaxima) {

        this.numeroCarro = numeroCarro;
        this.nomePiloto = nomePiloto;
        this.nomeEquipe = nomeEquipe;
        this.velocidadeMaxima = velocidadeMaxima;
        velocidadeAtual = 0;
        ligado = false;
    }

    //Implementação dos métodos da questão 02
    public void acelerar(double ganhoVelocidade) {

        if (ligado) { //Antes de acelerar, verificar se o carro está ligado

            double novaVelocidade = velocidadeAtual + ganhoVelocidade;
            if (novaVelocidade <= velocidadeMaxima)
                velocidadeAtual = novaVelocidade;
            else
                velocidadeAtual = velocidadeMaxima;            
        }
    }

    public void frear(double reducaoVelocidade) {

        if (ligado) //Antes de frear, verificar se o carro está ligado
            velocidadeAtual -= velocidadeAtual*(reducaoVelocidade/100);
    }

    public void ligar() {

        ligado = true; //carro ligado
    }

    public void desligar() {

        if (velocidadeAtual == 0)
            ligado = false; //carro desligou
    }

    public void parar() {

        velocidadeAtual = 0; //carro parado
    }

    public String status() {

        String ligado; //configurar uma String para aparecer na mensagem
        if (this.ligado)
            ligado = "ligado";
        else
            ligado = "desligado";

        return "O carro de corrida número " + numeroCarro + ", pilotado por "
        + nomePiloto + ", da equipe " + nomeEquipe + ", está " + ligado 
        + " e com velocidade atual em " + velocidadeAtual + " km/h.";
    }
}
