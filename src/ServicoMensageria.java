public class ServicoMensageria {
    public void enviarmensagem (){
        validaConexaoInternet();
        System.out.println("Enviando mensagem");
        salvaMensagemHistorico();
    }

    public void  recebeMensagem (){
        System.out.println("Recebendo a mensagem");
    }
    private void validaConexaoInternet(){
        System.out.println("Validando conexão");
    }
    private void salvaMensagemHistorico(){
        System.out.println("Salvando mensagem no histórico");
    }
}
