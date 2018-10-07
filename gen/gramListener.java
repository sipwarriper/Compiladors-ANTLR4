// Generated from /home/sipwarriper/IdeaProjects/ANTLR4-Compiladors/gram.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramParser}.
 */
public interface gramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramParser#prule}.
	 * @param ctx the parse tree
	 */
	void enterPrule(gramParser.PruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#prule}.
	 * @param ctx the parse tree
	 */
	void exitPrule(gramParser.PruleContext ctx);
}