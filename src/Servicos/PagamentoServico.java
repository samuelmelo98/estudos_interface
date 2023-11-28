package Servicos;

import Entidades.Aluguel;
import Entidades.Pagamento;

import java.time.Duration;

public class PagamentoServico   {

    private Double precoPorHora;
    private Double precoPorDia;
    private TaxaServicoInterface taxaServico;

    public PagamentoServico(Double precoPorHora, Double precoPorDia, TaxaServicoInterface taxaServico) {
        this.precoPorHora = precoPorHora;
        this.precoPorDia = precoPorDia;
        this.taxaServico = taxaServico;
    }

    public Double getPrecoPorHora() {
        return precoPorHora;
    }

    public void setPrecoPorHora(Double precoPorHora) {
        this.precoPorHora = precoPorHora;
    }

    public Double getPrecoPorDia() {
        return precoPorDia;
    }

    public void setPrecoPorDia(Double precoPorDia) {
        this.precoPorDia = precoPorDia;
    }

    public TaxaServicoInterface getTaxaServico() {
        return taxaServico;
    }

    public void setTaxaServico(TaxaServicoInterface taxaServico) {
        this.taxaServico = taxaServico;
    }

    public void processarPagamento(Aluguel aluguel){

       double minutos =  Duration.between(aluguel.getDtInicio(), aluguel.getDtFim()).toMinutes();
        double horas = minutos / 60;
        double pagamentoBasico;
        if(horas <= 12.0){
            pagamentoBasico = getPrecoPorHora() * Math.ceil(horas);
        } else{
            pagamentoBasico = getPrecoPorDia() * Math.ceil(horas/24);
        }
        double taxa = taxaServico.taxa(pagamentoBasico);
       aluguel.setPagamento(new Pagamento(pagamentoBasico,taxa));
    }
}
