package abstract_factory;

public class FabricaRoboAereo implements FabricaAbstrata{

    @Override
    public MovimentoRobo createMovimentoRobo() {
        return new RoboAereo();
    }
}
