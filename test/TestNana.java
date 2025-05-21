import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

public class TestNana {
    public static void main(String[] args) {
        try {
            // Ler o arquivo nana de entrada
            CharStream input = CharStreams.fromFileName("exemplo.nana");

            // Instanciar o lexer gerado pelo ANTLR
            nanaLexer lexer = new nanaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Instanciar o parser
            nanaParser parser = new nanaParser(tokens);

            // Definir o ponto de entrada (a regra inicial da gramática)
            ParseTree tree = parser.arquivo();

            // Exibir a árvore sintática no console
            System.out.println(tree.toStringTree(parser));

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
