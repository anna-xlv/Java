import java.util.Scanner;

public class ObjetoCadeira {

    static class Cadeira{
        String tipo;
        String cor;
        String material;
        String marca;

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
        public String getMaterial () {
            return material;
        }
        public void setMaterial (String material) {
            this.material = material;
        }
        public String getMarca () {
            return marca;
        }
        public void setMarca (String marca) {
            this.marca = marca;
        }
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Cadeira cadeirinha = new Cadeira();

        for (int i = 0; i < 3; i++) {

            System.out.println("\nQual o tipo da cadeira: ");
            cadeirinha.setTipo(sc.nextLine());
            System.out.println("Qual a cor da cadeira: ");
            cadeirinha.setCor(sc.nextLine());
            System.out.println("Qual o material da cadeira: ");
            cadeirinha.setMaterial(sc.nextLine());
            System.out.println("Qual a marca da cadeira: ");
            cadeirinha.setMarca(sc.nextLine());

            System.out.println("\n\n~~~~~~CADEIRA~~~~~~");
            System.out.println("Tipo: "+cadeirinha.getTipo());
            System.out.println("Cor: "+cadeirinha.getCor());
            System.out.println("Material: "+cadeirinha.getMaterial());
            System.out.println("Marca: "+cadeirinha.getMarca());
        }
    }
}
