package exe.gba.objeto;

import java.util.Scanner;

public class Opcoes {
    private String mostrarUsoCpu;
    private String mostrarUsoRam;
    private String mostrarPacotesEnviados;
    private String mostrarTaxaTransferencia;
    private String mostrarArmazenamentoTotal;
    private String mostrarArmazenamentoUsado;
    private String codigo;

    public Opcoes() {}

    public Opcoes(String mostrarUsoCpu, String mostrarUsoRam, String mostrarPacotesEnviados, String mostrarTaxaTransferencia,
                  String mostrarArmazenamentoTotal, String mostrarArmazenamentoUsado, String codigo) {
        this.mostrarUsoCpu = mostrarUsoCpu;
        this.mostrarUsoRam = mostrarUsoRam;
        this.mostrarPacotesEnviados = mostrarPacotesEnviados;
        this.mostrarTaxaTransferencia = mostrarTaxaTransferencia;
        this.mostrarArmazenamentoTotal = mostrarArmazenamentoTotal;
        this.mostrarArmazenamentoUsado = mostrarArmazenamentoUsado;
        this.codigo = codigo;
    }

    public void setOpcoes(Scanner leitorString) {
        System.out.print("1) ");
        this.mostrarUsoCpu = leitorString.nextLine();

        System.out.print("2) ");
        this.mostrarUsoRam = leitorString.nextLine();

        System.out.print("3) ");
        this.mostrarPacotesEnviados = leitorString.nextLine();

        System.out.print("4) ");
        this.mostrarTaxaTransferencia = leitorString.nextLine();

        System.out.print("5) ");
        this.mostrarArmazenamentoTotal = leitorString.nextLine();

        System.out.print("6) ");
        this.mostrarArmazenamentoUsado = leitorString.nextLine();
    }

    public String getMostrarUsoCpu() {
        return mostrarUsoCpu;
    }

    public void setMostrarUsoCpu(String mostrarUsoCpu) {
        this.mostrarUsoCpu = mostrarUsoCpu;
    }

    public String getMostrarUsoRam() {
        return mostrarUsoRam;
    }

    public void setMostrarUsoRam(String mostrarUsoRam) {
        this.mostrarUsoRam = mostrarUsoRam;
    }

    public String getMostrarPacotesEnviados() {
        return mostrarPacotesEnviados;
    }

    public void setMostrarPacotesEnviados(String mostrarPacotesEnviados) { this.mostrarPacotesEnviados = mostrarPacotesEnviados; }

    public String getMostrarTaxaTransferencia() {
        return mostrarTaxaTransferencia;
    }

    public void setMostrarTaxaTransferencia(String mostrarTaxaTransferencia) {
        this.mostrarTaxaTransferencia = mostrarTaxaTransferencia;
    }

    public String getMostrarArmazenamentoTotal() {
        return mostrarArmazenamentoTotal;
    }

    public void setMostrarArmazenamentoTotal(String mostrarArmazenamentoTotal) {
        this.mostrarArmazenamentoTotal = mostrarArmazenamentoTotal;
    }

    public String getMostrarArmazenamentoUsado() {
        return mostrarArmazenamentoUsado;
    }

    public void setmostrarArmazenamentoUsado(String mostrarArmazenamentoUsado) {
        this.mostrarArmazenamentoUsado = mostrarArmazenamentoUsado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(Scanner leitorString) {
        System.out.println("Máquina não autenticada!");

        System.out.print("Insira o código alfanumérico: ");
        String codigo = leitorString.nextLine();

        if (codigo.length() == 6) {
            this.codigo = codigo;
        }
    }

    @Override
    public String toString() {
        return """
                +------------------------------------------------------+
                | Opções Atuais                                        |
                +------------------------------------------------------+
                | Mostrar uso da CPU: %s                                |
                | Mostrar uso de RAM: %s                                |
                | Mostrar pacotes enviados: %s                          |
                | Mostrar a taxa de transferência: %s                   |
                | Mostrar armazenamento total: %s                       |
                | Mostrar armazenamento usado: %s                       |
                +------------------------------------------------------+
                | (1 = Mostrando / 0 = Oculto)                         |
                +------------------------------------------------------+
                    """.formatted( mostrarUsoCpu, mostrarUsoRam, mostrarPacotesEnviados, mostrarTaxaTransferencia, mostrarArmazenamentoTotal, mostrarArmazenamentoUsado);
    }
}
