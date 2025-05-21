// Generated from nana.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link nanaParser}.
 */
public interface nanaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link nanaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(nanaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link nanaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(nanaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link nanaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(nanaParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link nanaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(nanaParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link nanaParser#linha}.
	 * @param ctx the parse tree
	 */
	void enterLinha(nanaParser.LinhaContext ctx);
	/**
	 * Exit a parse tree produced by {@link nanaParser#linha}.
	 * @param ctx the parse tree
	 */
	void exitLinha(nanaParser.LinhaContext ctx);
	/**
	 * Enter a parse tree produced by {@link nanaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(nanaParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link nanaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(nanaParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link nanaParser#varnana_decl}.
	 * @param ctx the parse tree
	 */
	void enterVarnana_decl(nanaParser.Varnana_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link nanaParser#varnana_decl}.
	 * @param ctx the parse tree
	 */
	void exitVarnana_decl(nanaParser.Varnana_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link nanaParser#constn_decl}.
	 * @param ctx the parse tree
	 */
	void enterConstn_decl(nanaParser.Constn_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link nanaParser#constn_decl}.
	 * @param ctx the parse tree
	 */
	void exitConstn_decl(nanaParser.Constn_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link nanaParser#troca_tipo}.
	 * @param ctx the parse tree
	 */
	void enterTroca_tipo(nanaParser.Troca_tipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link nanaParser#troca_tipo}.
	 * @param ctx the parse tree
	 */
	void exitTroca_tipo(nanaParser.Troca_tipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link nanaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(nanaParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link nanaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(nanaParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link nanaParser#funcao_chamada}.
	 * @param ctx the parse tree
	 */
	void enterFuncao_chamada(nanaParser.Funcao_chamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link nanaParser#funcao_chamada}.
	 * @param ctx the parse tree
	 */
	void exitFuncao_chamada(nanaParser.Funcao_chamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link nanaParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(nanaParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link nanaParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(nanaParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link nanaParser#controle}.
	 * @param ctx the parse tree
	 */
	void enterControle(nanaParser.ControleContext ctx);
	/**
	 * Exit a parse tree produced by {@link nanaParser#controle}.
	 * @param ctx the parse tree
	 */
	void exitControle(nanaParser.ControleContext ctx);
	/**
	 * Enter a parse tree produced by {@link nanaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(nanaParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link nanaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(nanaParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link nanaParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(nanaParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link nanaParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(nanaParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link nanaParser#funcao_def}.
	 * @param ctx the parse tree
	 */
	void enterFuncao_def(nanaParser.Funcao_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link nanaParser#funcao_def}.
	 * @param ctx the parse tree
	 */
	void exitFuncao_def(nanaParser.Funcao_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link nanaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(nanaParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link nanaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(nanaParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link nanaParser#tratamento_erro}.
	 * @param ctx the parse tree
	 */
	void enterTratamento_erro(nanaParser.Tratamento_erroContext ctx);
	/**
	 * Exit a parse tree produced by {@link nanaParser#tratamento_erro}.
	 * @param ctx the parse tree
	 */
	void exitTratamento_erro(nanaParser.Tratamento_erroContext ctx);
	/**
	 * Enter a parse tree produced by {@link nanaParser#importacao}.
	 * @param ctx the parse tree
	 */
	void enterImportacao(nanaParser.ImportacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link nanaParser#importacao}.
	 * @param ctx the parse tree
	 */
	void exitImportacao(nanaParser.ImportacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link nanaParser#comentario}.
	 * @param ctx the parse tree
	 */
	void enterComentario(nanaParser.ComentarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link nanaParser#comentario}.
	 * @param ctx the parse tree
	 */
	void exitComentario(nanaParser.ComentarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link nanaParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(nanaParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link nanaParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(nanaParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link nanaParser#lista}.
	 * @param ctx the parse tree
	 */
	void enterLista(nanaParser.ListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link nanaParser#lista}.
	 * @param ctx the parse tree
	 */
	void exitLista(nanaParser.ListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link nanaParser#dicionario}.
	 * @param ctx the parse tree
	 */
	void enterDicionario(nanaParser.DicionarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link nanaParser#dicionario}.
	 * @param ctx the parse tree
	 */
	void exitDicionario(nanaParser.DicionarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link nanaParser#setc}.
	 * @param ctx the parse tree
	 */
	void enterSetc(nanaParser.SetcContext ctx);
	/**
	 * Exit a parse tree produced by {@link nanaParser#setc}.
	 * @param ctx the parse tree
	 */
	void exitSetc(nanaParser.SetcContext ctx);
	/**
	 * Enter a parse tree produced by {@link nanaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(nanaParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link nanaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(nanaParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link nanaParser#operador_aritmetico}.
	 * @param ctx the parse tree
	 */
	void enterOperador_aritmetico(nanaParser.Operador_aritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link nanaParser#operador_aritmetico}.
	 * @param ctx the parse tree
	 */
	void exitOperador_aritmetico(nanaParser.Operador_aritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link nanaParser#operador_logico}.
	 * @param ctx the parse tree
	 */
	void enterOperador_logico(nanaParser.Operador_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link nanaParser#operador_logico}.
	 * @param ctx the parse tree
	 */
	void exitOperador_logico(nanaParser.Operador_logicoContext ctx);
}