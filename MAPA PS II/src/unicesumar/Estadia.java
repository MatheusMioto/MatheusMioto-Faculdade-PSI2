
package unicesumar;


public class Estadia {
    private Responsavel responsavel;
    private Crianca crianca;
    private int tempoUtilizado;

    /**
     * @return the responsavel
     */
    public Responsavel getResponsavel() {
        return responsavel;
    }

    /**
     * @param responsavel the responsavel to set
     */
    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    /**
     * @return the crianca
     */
    public Crianca getCrianca() {
        return crianca;
    }

    /**
     * @param crianca the crianca to set
     */
    public void setCrianca(Crianca crianca) {
        this.crianca = crianca;
    }

    /**
     * @return the tempoUtilizado
     */
    public int getTempoUtilizado() {
        return tempoUtilizado;
    }

    /**
     * @param tempoUtilizado the tempoUtilizado to set
     */
    public void setTempoUtilizado(int tempoUtilizado) {
        this.tempoUtilizado = tempoUtilizado;
    }
    public static double calcularCusto(int tempo) {
        double taxaPorMinuto = 1.5;
        double custo = tempo * taxaPorMinuto;

        if (tempo > 60) {
            custo *= 0.85;
        } else if (tempo > 40) {
            custo *= 0.90;
        } else if (tempo > 20) {
            custo *= 0.95;
        }

        return custo;
    }
    
}
