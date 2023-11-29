package Servicos;

public class CalcularParcelaService implements ParcelamentoInterface {
    @Override
    public Double[] parcelamento(Integer nParcelas, Double valorContrato) {
       Double[] valores = new Double[nParcelas];
       Double valorParcela = valorContrato / nParcelas;
       Double taxaLiberacao = valorParcela * 0.2 /100;

       for(int i = 0; i < valores.length; i++){
           valores[i] = valorParcela =+ 0.1 + taxaLiberacao;
       }
       return valores;
    }
}
