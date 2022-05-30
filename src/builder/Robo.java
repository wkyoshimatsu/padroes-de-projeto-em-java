package builder;

public class Robo {
    private final TipoRobo tipo;
    private final boolean rodas;
    private final boolean helices;
    private final boolean propulsor;

    public Robo(TipoRobo tipo, boolean rodas, boolean helices, boolean propulsor) {
        this.tipo = tipo;
        this.rodas = rodas;
        this.helices = helices;
        this.propulsor = propulsor;
    }

    public TipoRobo getTipo() {
        return tipo;
    }

    public boolean isRodas() {
        return rodas;
    }

    public boolean isHelices() {
        return helices;
    }

    public boolean isPropulsor() {
        return propulsor;
    }
}
