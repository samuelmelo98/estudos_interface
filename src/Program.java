import Entidades.Aluguel;
import Entidades.Carro;
import Servicos.PagamentoServico;
import Servicos.TaxaServico;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String args[]){
        System.out.println("teste...");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Formatar data e hora
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro:");
        String carModel = sc.nextLine();
        System.out.println("Retirada: (dd/MM/yyyy hh:mm):");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(),fmt);
        System.out.println("Devolução: (dd/MM/yyyy hh:mm):");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(),fmt);

        //Instancia o objeto do modelo de negocio
        Aluguel aluguel = new Aluguel(start, finish, new Carro(carModel));

        System.out.print("Entre com o preço por hora:");
        Double precoPorHora = sc.nextDouble();
        System.out.print("Entre com o preço por dia:");
        Double precoPorDia = sc.nextDouble();

        PagamentoServico pagamentoServico = new PagamentoServico(precoPorHora,precoPorDia,new TaxaServico());

        pagamentoServico.processarPagamento(aluguel);

        System.out.println("Pagamento Basico:"+ String.format("%.2f",aluguel.getPagamento().getPagamentoBasico()));
        System.out.println("Pagamento Imposto:" + String.format("%.2f",aluguel.getPagamento().getTaxa()));
        System.out.println("Pagamento Total:" + String.format("%.2f",aluguel.getPagamento().getPagametoTotal()));










        sc.close();

    }
}
