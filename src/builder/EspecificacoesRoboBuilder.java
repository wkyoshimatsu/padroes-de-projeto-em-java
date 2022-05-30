package builder;

public class EspecificacoesRoboBuilder implements Builder{
    private TipoRobo tipo;
    private boolean rodas;
    private boolean helices;
    private boolean propulsor;

    @Override
    public void setTipoRobo(TipoRobo tipo) {
        this.tipo = tipo;
    }
    @Override
    public void setRodas(boolean rodas) {
        this.rodas = rodas;
    }

    @Override
    public void setHelices(boolean helices) {
        this.helices = helices;
    }

    @Override
    public void setPropulsor(boolean propulsor) {
        this.propulsor = propulsor;
    }

    public Especificacoes getResultado() {
        return new Especificacoes(tipo, rodas, helices, propulsor);
    }
}
