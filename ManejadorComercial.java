package models;

public class ManejadorComercial extends Manejador{


    @Override
    public String comprobar(Mail elMail) {
        if(elMail.getDestino().equals("comercial@colmena.com")||elMail.getAsunto().equals("comercial")){
            return "Enviando a comercial...";
        }else{
          return getSiguienteManejador().comprobar(elMail);
        }

    }
}
