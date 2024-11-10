public class DocumentoPdf  extends Documento{

    @Override
    public void exportar(String informacion) {
      
        System.out.println("Su documento fue exportado y transformado a PDF, con la siguiente informacion: " + informacion);
    }
    
}
