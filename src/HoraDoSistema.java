import java.awt.*;
import java.util.Date;
import java.util.Locale;

public class HoraDoSistema {
    public static void main(String[] args){
        Date relogio = new Date();
        System.out.println("A hora atual é ");
        System.out.println(relogio.toString());
        Locale local = Locale.getDefault();
        System.out.println("O indioma usado por você é");
        System.out.println(local.getDisplayLanguage());
        Toolkit resolucaoTela = Toolkit.getDefaultToolkit();
        Dimension dimensao = resolucaoTela.getScreenSize();
        System.out.println("A resolução que você está usando por você é" +dimensao.width +"X"+ dimensao.height);
    }
}
