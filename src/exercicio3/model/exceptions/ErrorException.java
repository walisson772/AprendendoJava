package exercicio3.model.exceptions;

public class ErrorException extends Exception{
    public static final long serialVersionUID = 1l;

    public ErrorException(String msg){
        super(msg);
    }
}
