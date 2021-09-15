import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MainPlsql {

    public static final String INPUT_FILE = "input2.sql";

    public static void main(String[] args) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(INPUT_FILE)));
            content = content.toUpperCase();
            PlSqlLexer lexer;
            try {
                lexer = new PlSqlLexer(new ANTLRInputStream(new ByteArrayInputStream(content.getBytes("UTF-8"))));
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                PlSqlParser parser = new PlSqlParser(tokens);
//                parser.setTrace(true);
                parser.addParseListener(new ParseTreeListener() {
					
					@Override
					public void visitTerminal(TerminalNode node) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void visitErrorNode(ErrorNode node) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void exitEveryRule(ParserRuleContext ctx) {
						if ( ctx.getRuleIndex() == PlSqlParser.RULE_bind_variable ) {
							String string = ctx.getText();
//							ctx.getStart().getStopIndex();
//							StartIndex()EIndex()
							System.out.println("RULE_bind_variable ===> ? " + string);
						}
					}
					
					@Override
					public void enterEveryRule(ParserRuleContext ctx) {
						// TODO Auto-generated method stub
						
					}
				});
//                String str = parser.sql_script().unit_statement()
//                        .data_manipulation_language_statements()
//                        .merge_statement().toString();
                ParserRuleContext ruleContext = parser.sql_script();
                Trees.inspect(ruleContext, parser);
//                ParseTree tree = parser.file();
//                ParseTreeWalker walker = new ParseTreeWalker();
//                CSVLoader loader = new CSVLoader();
//                walker.walk(loader,tree);
//
//                for(Map<String,String> row:loader.rows)
//                    System.out.println(row.values());

            } catch (IOException e) {
                e.printStackTrace();
                return;
            }

        } catch (Exception e) {
            System.err.println("Input file not found.");
            return;
        }
    }
}
