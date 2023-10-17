import java.util.Scanner;

class Funcionario {
    private int numero;
    private double horasTrabalhadas;
    private double valorPorHora;

    public Funcionario(int numero, double horasTrabalhadas, double valorPorHora) {
        this.numero = numero;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    public double calcularSalario() {
        return horasTrabalhadas * valorPorHora;
    }

    public void exibirDados() {
        System.out.printf("Número do Funcionário: %d%n", numero);
        System.out.printf("Horas Trabalhadas: %.2f%n", horasTrabalhadas);
        System.out.printf("Valor por Hora: %.2f%n", valorPorHora);
        System.out.printf("Salário: %.2f%n", calcularSalario());
    }
}

public class CalculoSalarioFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do funcionário: ");
        int numero = scanner.nextInt();
        System.out.print("Digite o número de horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();
        System.out.print("Digite o valor recebido por hora: ");
        double valorPorHora = scanner.nextDouble();

        Funcionario funcionario = new Funcionario(numero, horasTrabalhadas, valorPorHora);

        System.out.println("\nDados do Funcionário:");
        funcionario.exibirDados();

        scanner.close();
    }
}
