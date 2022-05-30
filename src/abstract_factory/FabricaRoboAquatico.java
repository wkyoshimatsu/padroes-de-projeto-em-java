package abstract_factory;

public class FabricaRoboAquatico implements FabricaAbstrata{

    @Override
    public MovimentoRobo createMovimentoRobo() {
        return new RoboAquatico();
    }
}
