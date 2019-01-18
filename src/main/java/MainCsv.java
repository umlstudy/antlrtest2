import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

public class MainCsv {

    public static final String INPUT_CSV = "input.csv";

    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream(INPUT_CSV);

            CSVLexer lexer;
            try {
                lexer = new CSVLexer(new ANTLRInputStream(fileInputStream));
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                CSVParser parser = new CSVParser(tokens);
//                ParserRuleContext ruleContext = parser.file();
//                Trees.inspect(ruleContext, parser);
                ParseTree tree = parser.file();
                ParseTreeWalker walker = new ParseTreeWalker();
                CSVLoader loader = new CSVLoader();
                walker.walk(loader,tree);

                for(Map<String,String> row:loader.rows)
                    System.out.println(row.values());

            } catch (IOException e) {
                e.printStackTrace();
                return;
            }

        } catch (FileNotFoundException e) {
            System.err.println("Input file not found.");
            return;
        }
    }
}
