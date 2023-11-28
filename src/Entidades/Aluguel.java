package Entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Aluguel {
    private LocalDateTime dtInicio;
    private LocalDateTime dtFim;
    private Carro carro;
    private  Pagamento pagamento;

    public Aluguel(LocalDateTime dtInicio, LocalDateTime dtFim, Carro carro) {
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
        this.carro = carro;

    }

    public LocalDateTime getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(LocalDateTime dtInicio) {
        this.dtInicio = dtInicio;
    }

    public LocalDateTime getDtFim() {
        return dtFim;
    }

    public void setDtFim(LocalDateTime dtFim) {
        this.dtFim = dtFim;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
}
