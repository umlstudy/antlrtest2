// Generated from C:/Temp/antlrtest2/src/main/java\CSV.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CSVParser}.
 */
public interface CSVListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CSVParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(CSVParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSVParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(CSVParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSVParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(CSVParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSVParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(CSVParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSVParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(CSVParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSVParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(CSVParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code text}
	 * labeled alternative in {@link CSVParser#entry}.
	 * @param ctx the parse tree
	 */
	void enterText(CSVParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code text}
	 * labeled alternative in {@link CSVParser#entry}.
	 * @param ctx the parse tree
	 */
	void exitText(CSVParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code empty}
	 * labeled alternative in {@link CSVParser#entry}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(CSVParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code empty}
	 * labeled alternative in {@link CSVParser#entry}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(CSVParser.EmptyContext ctx);
}