// Generated from C:/Users/patri/Documents/GitHub/SchoolOfRock/PlaneadorAudicoes/src/AuditionParser\plano.g4 by ANTLR 4.5.1
package AuditionParser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link planoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface planoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link planoParser#audicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAudicao(planoParser.AudicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link planoParser#plano}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlano(planoParser.PlanoContext ctx);
	/**
	 * Visit a parse tree produced by {@link planoParser#atuacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtuacao(planoParser.AtuacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link planoParser#aluno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAluno(planoParser.AlunoContext ctx);
	/**
	 * Visit a parse tree produced by {@link planoParser#professor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProfessor(planoParser.ProfessorContext ctx);
	/**
	 * Visit a parse tree produced by {@link planoParser#peca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeca(planoParser.PecaContext ctx);
	/**
	 * Visit a parse tree produced by {@link planoParser#nome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNome(planoParser.NomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link planoParser#local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal(planoParser.LocalContext ctx);
	/**
	 * Visit a parse tree produced by {@link planoParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(planoParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link planoParser#hora}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHora(planoParser.HoraContext ctx);
}