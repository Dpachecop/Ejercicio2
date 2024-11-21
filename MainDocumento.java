public class MainDocumento {
    public static void main(String[] args) {
        
GestorDocumento gestorDocumento = new GestorDocumento();
Documento DocumentoExcel = new DocumentoExcel();
Documento DocumentoPdf = new DocumentoPdf();
Documento DocumentoWord = new DocumentoWord();



gestorDocumento.exportar(DocumentoWord, "Documento word #1");
gestorDocumento.exportar(DocumentoPdf, "Documento PDF #1");
gestorDocumento.exportar(DocumentoExcel, "Documento Excel #1");





    }
}
