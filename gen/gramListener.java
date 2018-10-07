// Generated from /home/sipwarriper/IdeaProjects/ANTLR4-Compiladors/gram.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramParser}.
 */
public interface gramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramParser#inici}.
	 * @param ctx the parse tree
	 */
	void enterInici(gramParser.IniciContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#inici}.
	 * @param ctx the parse tree
	 */
	void exitInici(gramParser.IniciContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#testingRule}.
	 * @param ctx the parse tree
	 */
	void enterTestingRule(gramParser.TestingRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#testingRule}.
	 * @param ctx the parse tree
	 */
	void exitTestingRule(gramParser.TestingRuleContext ctx);
}