package codigo;
import java.io.File;
/*
@author Dulce
*/
public class Principal {
    public static void main(String[] args) {
        String ruta = "C:/Users/edens/OneDrive/Documentos/AnalizadorLex/src/codigo/Lexer.flex";
        generarLexer(ruta);
    }
    public static void generarLexer(String ruta){
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
    }
}