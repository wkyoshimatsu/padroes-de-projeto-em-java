package builder;

public class Diretor {
    public void constructorRoboTerrestre(Builder builder){
        builder.setTipoRobo(TipoRobo.TERRESTRE);
        builder.setRodas(true);
        builder.setHelices(false);
        builder.setPropulsor(false);
    }

    public void constructorRoboAereo(Builder builder){
        builder.setTipoRobo(TipoRobo.AEREO);
        builder.setRodas(false);
        builder.setHelices(true);
        builder.setPropulsor(false);
    }

    public void constructorRoboAquatico(Builder builder){
        builder.setTipoRobo(TipoRobo.AQUATICO);
        builder.setRodas(false);
        builder.setHelices(false);
        builder.setPropulsor(true);
    }

}
