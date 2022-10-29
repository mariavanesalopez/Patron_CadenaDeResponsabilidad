package models;

public class ManejadorTecnico extends Manejador{
    @Override
    public String comprobar(Mail elMail) {
        if (elMail.getDestino().equals("tecnico@colmena.com") || elMail.getAsunto().equals("tecnico")) {
            return "Enviando a tecnico..";

        }else{
            return getSiguienteManejador().comprobar(elMail);
        }
    }
}
