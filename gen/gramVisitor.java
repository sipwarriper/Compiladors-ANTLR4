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
	/**
	 * Visit a parse tree produced by {@link gramParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(gramParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(gramParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#typeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBlock(gramParser.TypeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#newType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewType(gramParser.NewTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#basicType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicType(gramParser.BasicTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#vectorDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVectorDec(gramParser.VectorDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#tuplaDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuplaDec(gramParser.TuplaDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#constBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstBlock(gramParser.ConstBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#varBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarBlock(gramParser.VarBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#funcDecBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDecBlock(gramParser.FuncDecBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#accioDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccioDec(gramParser.AccioDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#funcDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDec(gramParser.FuncDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(gramParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#funcImpBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncImpBlock(gramParser.FuncImpBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#accioImp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccioImp(gramParser.AccioImpContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#funcImp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncImp(gramParser.FuncImpContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(gramParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(gramParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#if_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_rule(gramParser.If_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#for_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_rule(gramParser.For_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#while_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_rule(gramParser.While_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#accio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccio(gramParser.AccioContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(gramParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(gramParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#writeln}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteln(gramParser.WritelnContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(gramParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#constValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstValue(gramParser.ConstValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#tuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple(gramParser.TupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector(gramParser.VectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(gramParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(gramParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#logicsDown}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicsDown(gramParser.LogicsDownContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#logicUp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicUp(gramParser.LogicUpContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#sum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum(gramParser.SumContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(gramParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#neg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeg(gramParser.NegContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(gramParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#parenthesis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(gramParser.ParenthesisContext ctx);
}