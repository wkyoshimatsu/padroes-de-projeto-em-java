package builder;

public class Especificacoes {
    private final TipoRobo tipo;
    private final boolean rodas;
    private final boolean helices;
    private final boolean propulsor;

    public Especificacoes(TipoRobo tipo, boolean rodas, boolean helices, boolean propulsor) {
        this.tipo = tipo;
        this.rodas = rodas;
        this.helices = helices;
        this.propulsor = propulsor;
    }

    public String print(){
        String info = "";
        info += "Tipo de robo:" + tipo + "\n";
        info += "Possui rodas:" + rodas + "\n";
        info += "Possui hélices:" + helices + "\n";
        info += "Possui propulsores:" + propulsor + "\n";
        return info;
    }
}
