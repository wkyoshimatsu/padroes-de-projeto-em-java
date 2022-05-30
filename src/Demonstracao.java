import abstract_factory.*;
import builder.*;

import java.util.Scanner;

public class Demonstracao {
    private static Application selecionaTipoRobo(int entrada){

        Application app = null;
        FabricaAbstrata fabrica;

        switch (entrada) {
            case 1 -> {
                fabrica = new FabricaRoboTerrestre();
                app = new Application(fabrica);
            }
            case 2 -> {
                fabrica = new FabricaRoboAquatico();
                app = new Application(fabrica);
            }
            case 3 -> {
                fabrica = new FabricaRoboAereo();
                app = new Application(fabrica);
            }
            default -> {
            }
        }
       return app;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Selecione o tipo de robo:\n1 para terestre\n2 para aquático\n3 para aéreo");
        int entrada = input.nextInt();
/*        boolean entradaValida = true;
        while(entradaValida){
            System.out.println("Selecione o tipo de robo:\n1 para terestre\n2 para aquático\n3 para aéreo");
            entrada = input.nextInt();
            if (entrada != 1 && entrada != 2 && entrada != 3){
                entradaValida=true;
            }else{
                entradaValida=false;
            }
        }
*/
        Application app = selecionaTipoRobo(entrada);
        app.movimentoRobo();
        Diretor diretor = new Diretor();
        RoboBuilder builder = new RoboBuilder();
        EspecificacoesRoboBuilder especificacoesBuilder = new EspecificacoesRoboBuilder();

        switch (entrada) {
            case 1 -> {
                diretor.constructorRoboTerrestre(builder);
                diretor.constructorRoboTerrestre(especificacoesBuilder);
            }
            case 2 -> {
                diretor.constructorRoboAquatico(builder);
                diretor.constructorRoboAquatico(especificacoesBuilder);
            }
            case 3 -> {
                diretor.constructorRoboAereo(builder);
                diretor.constructorRoboAereo(especificacoesBuilder);
            }
            default -> {
            }
        }

        Robo robo = builder.getResultado();
        System.out.println("Foi construído o robo:" + robo.getTipo());

        Especificacoes especificacoesRobo = especificacoesBuilder.getResultado();
        System.out.println("\nEspecificções do robo construído:\n" + especificacoesRobo.print());
    }
}
