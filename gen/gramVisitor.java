// Generated from /home/sipwarriper/IdeaProjects/ANTLR4-Compiladors/gram.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramParser#inici}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInici(gramParser.IniciContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#testingRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestingRule(gramParser.TestingRuleContext ctx);
}