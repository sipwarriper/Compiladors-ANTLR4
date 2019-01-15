
import java.io.*;

import org.antlr.v4.runtime.*;

public class LansCompiler {
    public static void main(String args[]) throws Exception{
        if(args.length == 0){
            System.out.println("Es requereix un fitxer LANS");
            System.exit(0);
        }

        gramLexer lexer = new gramLexer(new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        gramParser p = new gramParser(tokens);
        if(args.length == 2){
            String classfile = args[1];
            if(!classfile.endsWith(".class"))
                classfile = classfile + ".class";
            //probablament per ficarli el nom que vole
            //p.setLANSClassFile(classfile);
        }
        p.constBlock();
    }
}
