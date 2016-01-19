// Generated from C:/Users/patri/Documents/GitHub/SchoolOfRock/PlaneadorAudicoes/src/AuditionParser\plano.g4 by ANTLR 4.5.1
package AuditionParser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link planoParser}.
 */
public interface planoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link planoParser#audicao}.
	 * @param ctx the parse tree
	 */
	void enterAudicao(planoParser.AudicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link planoParser#audicao}.
	 * @param ctx the parse tree
	 */
	void exitAudicao(planoParser.AudicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link planoParser#plano}.
	 * @param ctx the parse tree
	 */
	void enterPlano(planoParser.PlanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link planoParser#plano}.
	 * @param ctx the parse tree
	 */
	void exitPlano(planoParser.PlanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link planoParser#atuacao}.
	 * @param ctx the parse tree
	 */
	void enterAtuacao(planoParser.AtuacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link planoParser#atuacao}.
	 * @param ctx the parse tree
	 */
	void exitAtuacao(planoParser.AtuacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link planoParser#aluno}.
	 * @param ctx the parse tree
	 */
	void enterAluno(planoParser.AlunoContext ctx);
	/**
	 * Exit a parse tree produced by {@link planoParser#aluno}.
	 * @param ctx the parse tree
	 */
	void exitAluno(planoParser.AlunoContext ctx);
	/**
	 * Enter a parse tree produced by {@link planoParser#professor}.
	 * @param ctx the parse tree
	 */
	void enterProfessor(planoParser.ProfessorContext ctx);
	/**
	 * Exit a parse tree produced by {@link planoParser#professor}.
	 * @param ctx the parse tree
	 */
	void exitProfessor(planoParser.ProfessorContext ctx);
	/**
	 * Enter a parse tree produced by {@link planoParser#peca}.
	 * @param ctx the parse tree
	 */
	void enterPeca(planoParser.PecaContext ctx);
	/**
	 * Exit a parse tree produced by {@link planoParser#peca}.
	 * @param ctx the parse tree
	 */
	void exitPeca(planoParser.PecaContext ctx);
	/**
	 * Enter a parse tree produced by {@link planoParser#nome}.
	 * @param ctx the parse tree
	 */
	void enterNome(planoParser.NomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link planoParser#nome}.
	 * @param ctx the parse tree
	 */
	void exitNome(planoParser.NomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link planoParser#local}.
	 * @param ctx the parse tree
	 */
	void enterLocal(planoParser.LocalContext ctx);
	/**
	 * Exit a parse tree produced by {@link planoParser#local}.
	 * @param ctx the parse tree
	 */
	void exitLocal(planoParser.LocalContext ctx);
	/**
	 * Enter a parse tree produced by {@link planoParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(planoParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link planoParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(planoParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link planoParser#hora}.
	 * @param ctx the parse tree
	 */
	void enterHora(planoParser.HoraContext ctx);
	/**
	 * Exit a parse tree produced by {@link planoParser#hora}.
	 * @param ctx the parse tree
	 */
	void exitHora(planoParser.HoraContext ctx);
}