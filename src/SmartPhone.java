public class SmartPhone {
    public static void main(String[] args) {
        Mensageria01 app01 = new Mensageria01();
        app01.enviarmensagem();
        app01.recebeMensagem();

        Mensageria02 app02 = new Mensageria02();
        app02.enviarmensagem();
        app02.recebeMensagem();

        Mensageria03 app03 = new Mensageria03();
        app03.enviarmensagem();
        app03.recebeMensagem();
    }
}
