package vetores.intities;

public class Semanas {
    private int semana;
    private final int DIAS = 7;

    public Semanas(int semana){
        this.semana = semana;
    }

    public int getSemana(){
        return semana * DIAS;
    }
}
