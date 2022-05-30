package abstract_factory;

public class FabricaRoboTerrestre implements FabricaAbstrata{

    @Override
    public MovimentoRobo createMovimentoRobo() {
        return new RoboTerrestre();
    }
}
