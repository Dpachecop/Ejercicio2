public class DocumentoWord  extends Documento{

    @Override
    public void exportar(String informacion) {
        System.out.println("Su documento fue exportado y transformado a Word, con la siguiente informacion: " + informacion);
    }
    
}
