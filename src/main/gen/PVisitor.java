// Generated from C:/Temp/antlrtest2/src/main/java\P.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link P}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link P#r1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR1(P.R1Context ctx);
	/**
	 * Visit a parse tree produced by {@link P#r2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR2(P.R2Context ctx);
}