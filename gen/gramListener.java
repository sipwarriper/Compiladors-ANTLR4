// Generated from /home/sipwarriper/IdeaProjects/ANTLR4-Compiladors/src/gram.g4 by ANTLR 4.7

    import java.io.*;
    import javafx.util.Pair;
    import java.util.Vector;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramParser}.
 */
public interface gramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(gramParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(gramParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(gramParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(gramParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(gramParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(gramParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#typeBlock}.
	 * @param ctx the parse tree
	 */
	void enterTypeBlock(gramParser.TypeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#typeBlock}.
	 * @param ctx the parse tree
	 */
	void exitTypeBlock(gramParser.TypeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#newType}.
	 * @param ctx the parse tree
	 */
	void enterNewType(gramParser.NewTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#newType}.
	 * @param ctx the parse tree
	 */
	void exitNewType(gramParser.NewTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#basicType}.
	 * @param ctx the parse tree
	 */
	void enterBasicType(gramParser.BasicTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#basicType}.
	 * @param ctx the parse tree
	 */
	void exitBasicType(gramParser.BasicTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#vectorDec}.
	 * @param ctx the parse tree
	 */
	void enterVectorDec(gramParser.VectorDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#vectorDec}.
	 * @param ctx the parse tree
	 */
	void exitVectorDec(gramParser.VectorDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#tuplaDec}.
	 * @param ctx the parse tree
	 */
	void enterTuplaDec(gramParser.TuplaDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#tuplaDec}.
	 * @param ctx the parse tree
	 */
	void exitTuplaDec(gramParser.TuplaDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#constBlock}.
	 * @param ctx the parse tree
	 */
	void enterConstBlock(gramParser.ConstBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#constBlock}.
	 * @param ctx the parse tree
	 */
	void exitConstBlock(gramParser.ConstBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#varBlock}.
	 * @param ctx the parse tree
	 */
	void enterVarBlock(gramParser.VarBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#varBlock}.
	 * @param ctx the parse tree
	 */
	void exitVarBlock(gramParser.VarBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#funcDecBlock}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecBlock(gramParser.FuncDecBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#funcDecBlock}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecBlock(gramParser.FuncDecBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#accioDec}.
	 * @param ctx the parse tree
	 */
	void enterAccioDec(gramParser.AccioDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#accioDec}.
	 * @param ctx the parse tree
	 */
	void exitAccioDec(gramParser.AccioDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#funcDec}.
	 * @param ctx the parse tree
	 */
	void enterFuncDec(gramParser.FuncDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#funcDec}.
	 * @param ctx the parse tree
	 */
	void exitFuncDec(gramParser.FuncDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(gramParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(gramParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#funcImpBlock}.
	 * @param ctx the parse tree
	 */
	void enterFuncImpBlock(gramParser.FuncImpBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#funcImpBlock}.
	 * @param ctx the parse tree
	 */
	void exitFuncImpBlock(gramParser.FuncImpBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#accioImp}.
	 * @param ctx the parse tree
	 */
	void enterAccioImp(gramParser.AccioImpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#accioImp}.
	 * @param ctx the parse tree
	 */
	void exitAccioImp(gramParser.AccioImpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#funcImp}.
	 * @param ctx the parse tree
	 */
	void enterFuncImp(gramParser.FuncImpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#funcImp}.
	 * @param ctx the parse tree
	 */
	void exitFuncImp(gramParser.FuncImpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(gramParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(gramParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(gramParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(gramParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#if_rule}.
	 * @param ctx the parse tree
	 */
	void enterIf_rule(gramParser.If_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#if_rule}.
	 * @param ctx the parse tree
	 */
	void exitIf_rule(gramParser.If_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#for_rule}.
	 * @param ctx the parse tree
	 */
	void enterFor_rule(gramParser.For_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#for_rule}.
	 * @param ctx the parse tree
	 */
	void exitFor_rule(gramParser.For_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#while_rule}.
	 * @param ctx the parse tree
	 */
	void enterWhile_rule(gramParser.While_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#while_rule}.
	 * @param ctx the parse tree
	 */
	void exitWhile_rule(gramParser.While_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#accio}.
	 * @param ctx the parse tree
	 */
	void enterAccio(gramParser.AccioContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#accio}.
	 * @param ctx the parse tree
	 */
	void exitAccio(gramParser.AccioContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(gramParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(gramParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(gramParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(gramParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#writeln}.
	 * @param ctx the parse tree
	 */
	void enterWriteln(gramParser.WritelnContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#writeln}.
	 * @param ctx the parse tree
	 */
	void exitWriteln(gramParser.WritelnContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(gramParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(gramParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#constValue}.
	 * @param ctx the parse tree
	 */
	void enterConstValue(gramParser.ConstValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#constValue}.
	 * @param ctx the parse tree
	 */
	void exitConstValue(gramParser.ConstValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#tuple}.
	 * @param ctx the parse tree
	 */
	void enterTuple(gramParser.TupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#tuple}.
	 * @param ctx the parse tree
	 */
	void exitTuple(gramParser.TupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#vector}.
	 * @param ctx the parse tree
	 */
	void enterVector(gramParser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#vector}.
	 * @param ctx the parse tree
	 */
	void exitVector(gramParser.VectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(gramParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(gramParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(gramParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(gramParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#logicsDown}.
	 * @param ctx the parse tree
	 */
	void enterLogicsDown(gramParser.LogicsDownContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#logicsDown}.
	 * @param ctx the parse tree
	 */
	void exitLogicsDown(gramParser.LogicsDownContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#logicUp}.
	 * @param ctx the parse tree
	 */
	void enterLogicUp(gramParser.LogicUpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#logicUp}.
	 * @param ctx the parse tree
	 */
	void exitLogicUp(gramParser.LogicUpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterSum(gramParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitSum(gramParser.SumContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(gramParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(gramParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#neg}.
	 * @param ctx the parse tree
	 */
	void enterNeg(gramParser.NegContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#neg}.
	 * @param ctx the parse tree
	 */
	void exitNeg(gramParser.NegContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(gramParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(gramParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#parenthesis}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(gramParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#parenthesis}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(gramParser.ParenthesisContext ctx);
}