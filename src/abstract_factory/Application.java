package abstract_factory;

public class Application{
    private MovimentoRobo movimentoRobo;

    public Application(FabricaAbstrata fabrica){
        movimentoRobo = fabrica.createMovimentoRobo();
    }

    public void movimentoRobo(){
        movimentoRobo.movimentoRobo();
    }
}
