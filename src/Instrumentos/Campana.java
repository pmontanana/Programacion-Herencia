package Instrumentos;

public class Campana extends Instrumento{
    public Campana(){
        super();
    }

    @Override
    public void interpretar() {
        for(Nota nota: melodia){
            switch(nota){
                case DO:
                    System.out.println("DO");
                    break;
                case RE:
                    System.out.println("RE");
                    break;
                case MI:
                    System.out.println("MI");
                    break;
                case FA:
                    System.out.println("FA");
                    break;
                case SOL:
                    System.out.println("SOL");
                    break;
                case LA:
                    System.out.println("LA");
                    break;
                case SI:
                    System.out.println("SI");
                    break;
            }
        }
    }
    
}
