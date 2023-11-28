package Servicos;

/**
 * Serviço implementado interface, para manter um baixo acoplamento.
 * Upper Cast
 */
public class TaxaServico implements TaxaServicoInterface {
    public Double taxa(Double valor){
        if(valor <= 100.0){
            return valor * 0.2;
        } else{
            return valor * 0.15;
        }
    }
}
