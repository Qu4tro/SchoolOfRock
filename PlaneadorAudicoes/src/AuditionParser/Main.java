package AuditionParser;

/**
 * @author damienvaz
 */

import org.antlr.v4.runtime.*;

import java.io.IOException;


public class Main {

    public static void main(String[] args) {

        CharStream stream;
        if(args.length == 1){
            try {
                stream = new ANTLRFileStream(args[0]);

            } catch (IOException e) {
                System.err.println("Ocorreu um problema ao tentar ler o ficheiro \"" + args[0] + "\".");
                e.printStackTrace();
                return;
            }
        } else{
            try {
                stream = new ANTLRInputStream(System.in);
            } catch (IOException e) {
                System.err.println("Ocorreu um problema ao tentar ler do stdin.");
                e.printStackTrace();
                return;
            }
        }

        System.out.println(stream.toString());

        planoLexer lexer = new planoLexer(stream);
        TokenStream token = new CommonTokenStream(lexer);
        planoParser parser = new planoParser(token);

        parser.audicao();
    }
}
