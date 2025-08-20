import java.util.Scanner;

public class ObjetoComputador {

    static class Computador {
        String placaMae;
        String cpu;
        String memoriaRam;
        String gpu;
        String armazenamento;
        String fonte;
        String gabinete;
        String cooler;
        String monitor;
        String teclado;
        String mouse;

        public String getPlacaMae() {
            return placaMae;
        }

        public void setPlacaMae(String placaMae) {
            this.placaMae = placaMae;
        }

        public String getCpu() {
            return cpu;
        }

        public void setCpu(String cpu) {
            this.cpu = cpu;
        }

        public String getMemoriaRam() {
            return memoriaRam;
        }

        public void setMemoriaRam(String memoriaRam) {
            this.memoriaRam = memoriaRam;
        }

        public String getGpu() {
            return gpu;
        }

        public void setGpu(String gpu) {
            this.gpu = gpu;
        }

        public String getArmazenamento() {
            return armazenamento;
        }

        public void setArmazenamento(String armazenamento) {
            this.armazenamento = armazenamento;
        }

        public String getFonte() {
            return fonte;
        }

        public void setFonte(String fonte) {
            this.fonte = fonte;
        }

        public String getGabinete() {
            return gabinete;
        }

        public void setGabinete(String gabinete) {
            this.gabinete = gabinete;
        }

        public String getCooler() {
            return cooler;
        }

        public void setCooler(String cooler) {
            this.cooler = cooler;
        }

        public String getMonitor() {
            return monitor;
        }

        public void setMonitor(String monitor) {
            this.monitor = monitor;
        }

        public String getTeclado() {
            return teclado;
        }

        public void setTeclado(String teclado) {
            this.teclado = teclado;
        }

        public String getMouse() {
            return mouse;
        }

        public void setMouse(String mouse) {
            this.mouse = mouse;
        }
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        Computador pc = new Computador();

        for (int i = 0; i < 3; i++) {
            System.out.println("\n\nQual é a placa-mãe ");
            pc.setPlacaMae(sc.nextLine());
            System.out.println("Qual é a CPU ");
            pc.setCpu(sc.nextLine());
            System.out.println("Qual é a memória RAM? ");
            pc.setMemoriaRam(sc.nextLine());
            System.out.println("Qual é a GPU? ");
            pc.setGpu(sc.nextLine());
            System.out.println("Qual é o armazenamento? ");
            pc.setArmazenamento(sc.nextLine());
            System.out.println("Qual é a fonte? ");
            pc.setFonte(sc.nextLine());
            System.out.println("Qual é o gabinete ");
            pc.setGabinete(sc.nextLine());
            System.out.println("Qual é o cooler? ");
            pc.setCooler(sc.nextLine());
            System.out.println("Qual é o monitor? ");
            pc.setMonitor(sc.nextLine());
            System.out.println("Qual é o teclado? ");
            pc.setTeclado(sc.nextLine());
            System.out.println("Qual é o mouse? ");
            pc.setMouse(sc.nextLine());

            System.out.println("\n~~~~~~COMPUTADOR~~~~~~");
            System.out.println("Placa-Mãe: "+pc.getPlacaMae());
            System.out.println("CPU: "+pc.getCpu());
            System.out.println("Memória RAM: "+pc.getMemoriaRam());
            System.out.println("GPU: "+pc.getGpu());
            System.out.println("Armazenamento: "+pc.getArmazenamento());
            System.out.println("Fonte: "+pc.getFonte());
            System.out.println("Gabinete: "+pc.getGabinete());
            System.out.println("Coller: "+pc.getCooler());
            System.out.println("Monitor: "+pc.getMonitor());
            System.out.println("Teclado: "+pc.getTeclado());
            System.out.println("Mouse: "+pc.getMouse());
        }


    }
}
