package models;

public class ManejadorGerencial extends Manejador{

    @Override
    public String comprobar(Mail elMail) {
        if (elMail.getDestino().equals("gerencia@colmena.com") || elMail.getAsunto().equals("gerencia")) {
            return "Enviando a Gerencia..";

        }else{
           return getSiguienteManejador().comprobar(elMail);
        }

    }
}
