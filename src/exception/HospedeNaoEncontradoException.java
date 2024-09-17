package exception;

public class HospedeNaoEncontradoException extends  RuntimeException{
    public HospedeNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}
