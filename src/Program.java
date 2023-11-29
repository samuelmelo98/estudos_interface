import Entidades.Aluguel;
import Entidades.Carro;
import Entidades.Contrato;
import Servicos.CalcularParcelaService;
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
        System.out.println("Entre com os dados do contrato");
        System.out.print("Número do contrato:");
        Integer nContrato = Integer.parseInt(sc.nextLine());
        System.out.print("Data do contrato: (dd/MM/yyyy hh:mm):");
        LocalDateTime dt_contrato = LocalDateTime.parse(sc.nextLine(),fmt);
        System.out.print("Entre com o valor do contrato:");
        Double valorContrato = sc.nextDouble();
        System.out.print("Entre com o número de parcelas:");
        Integer nParcelas = sc.nextInt();

        //Instancia o objeto do modelo de negocio
        CalcularParcelaService calcularParcelaService = new CalcularParcelaService();
        Double[] valorParcelas =  calcularParcelaService.parcelamento(nParcelas,valorContrato);
        Contrato contrato = new Contrato(nContrato,dt_contrato,valorContrato,nParcelas,calcularParcelaService);

        for(int i = 0; i< valorParcelas.length; i++) {
            int par = i +1;
            System.out.println("Valor da Parcela N:"+ par + "É igual a :"+ valorParcelas[i]);
        }
        for (Double items:valorParcelas) {
        }

        System.out.print("Entre com o preço por hora:");
        Double precoPorHora = sc.nextDouble();
        System.out.print("Entre com o preço por dia:");
        Double precoPorDia = sc.nextDouble();

//        PagamentoServico pagamentoServico = new PagamentoServico(precoPorHora,precoPorDia,new TaxaServico());
//
//        pagamentoServico.processarPagamento(aluguel);
//
//        System.out.println("Pagamento Basico:"+ String.format("%.2f",aluguel.getPagamento().getPagamentoBasico()));
//        System.out.println("Pagamento Imposto:" + String.format("%.2f",aluguel.getPagamento().getTaxa()));
//        System.out.println("Pagamento Total:" + String.format("%.2f",aluguel.getPagamento().getPagametoTotal()));










        sc.close();

    }
}
