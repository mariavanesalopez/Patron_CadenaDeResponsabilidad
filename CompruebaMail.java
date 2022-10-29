package models;

public class CompruebaMail {
    private Manejador inicial;

    public CompruebaMail() {
        inicial = new ManejadorGerencial();
        Manejador tecnico= new ManejadorTecnico();
        Manejador gerencial= new ManejadorGerencial();
        Manejador spam= new ManejadorSpam();

        inicial.setSiguienteManejador(gerencial);
        gerencial.setSiguienteManejador(tecnico);
        tecnico.setSiguienteManejador(spam);
    }
    public String comprobar(Mail elMail){
      return inicial.comprobar(elMail);
    }


}
