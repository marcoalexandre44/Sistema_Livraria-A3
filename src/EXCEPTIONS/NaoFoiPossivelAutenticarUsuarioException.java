package EXCEPTIONS;

public class NaoFoiPossivelAutenticarUsuarioException extends Exception {

    @Override
    public String getMessage() {
        return "Usuario não Cadastrado no sistema!";
    }

}
