import java.util.Scanner;

public class ObjetoAviao {

    static class Aviao {
        String tipo;
        String cor;
        int velocidade;
        int qtdDeAssento;

        public String getTipo () {
            return tipo;
        }
        public void setTipo (String tipo) {
            this.tipo = tipo;
        }
        public String getCor () {
            return cor;
        }
        public void setCor (String cor) {
            this.cor = cor;
        }
        public int getVelocidade () {
            return velocidade;
        }
        public void setVelocidade (int velocidade) {
            this.velocidade = velocidade;
        }
        public int getQtdDeAssunto () {
            return qtdDeAssento;
        }
        public void setQtdDeAssento (int qtdDeAssento) {
            this.qtdDeAssento = qtdDeAssento;
        }
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Aviao avi = new Aviao();


        for (int i = 0; i < 3; i++) {

            System.out.println("\nTipo do avião: ");
            avi.setTipo(sc.nextLine());
            System.out.println("Cor do avião: ");
            avi.setCor(sc.nextLine());
            System.out.println("Velocidade do avião:");
            avi.setVelocidade(sc.nextInt());
            System.out.println("Quantidade de assentos do avião: ");
            avi.setQtdDeAssento(sc.nextInt());
            sc.nextLine();

            System.out.println("\n\n~~~~~~AVIÃO~~~~~~");
            System.out.println("Tipo: "+avi.getTipo());
            System.out.println("Cor: "+avi.getCor());
            System.out.println("Velocidade: "+avi.getVelocidade());
            System.out.println("Quantidade de assento: "+avi.getQtdDeAssunto());


        }

    }
}
