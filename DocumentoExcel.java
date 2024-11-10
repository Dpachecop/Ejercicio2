public class DocumentoExcel extends Documento {

    @Override
    public void exportar(String informacion) {
       
        System.out.println("Su documento fue exportado y transformado a Excel, con la siguiente informacion: " + informacion);
    }
    
}
