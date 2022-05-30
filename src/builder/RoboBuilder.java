package builder;

public class RoboBuilder implements Builder{
    private TipoRobo tipo;
    private boolean rodas;
    private boolean helices;
    private boolean propulsor;

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

    public Robo getResultado() {
        return new Robo(tipo, rodas, helices, propulsor);
    }
}
