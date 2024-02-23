// Generated from experiment.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link experimentParser}.
 */
public interface experimentListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link experimentParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(experimentParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(experimentParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(experimentParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(experimentParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#declaracaoVariavel}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoVariavel(experimentParser.DeclaracaoVariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#declaracaoVariavel}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoVariavel(experimentParser.DeclaracaoVariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(experimentParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(experimentParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#declaracaoFuncao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoFuncao(experimentParser.DeclaracaoFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#declaracaoFuncao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoFuncao(experimentParser.DeclaracaoFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(experimentParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(experimentParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(experimentParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(experimentParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(experimentParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(experimentParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#comentario}.
	 * @param ctx the parse tree
	 */
	void enterComentario(experimentParser.ComentarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#comentario}.
	 * @param ctx the parse tree
	 */
	void exitComentario(experimentParser.ComentarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(experimentParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(experimentParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(experimentParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(experimentParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#estruturaControle}.
	 * @param ctx the parse tree
	 */
	void enterEstruturaControle(experimentParser.EstruturaControleContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#estruturaControle}.
	 * @param ctx the parse tree
	 */
	void exitEstruturaControle(experimentParser.EstruturaControleContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#caseLista}.
	 * @param ctx the parse tree
	 */
	void enterCaseLista(experimentParser.CaseListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#caseLista}.
	 * @param ctx the parse tree
	 */
	void exitCaseLista(experimentParser.CaseListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#caseDecl}.
	 * @param ctx the parse tree
	 */
	void enterCaseDecl(experimentParser.CaseDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#caseDecl}.
	 * @param ctx the parse tree
	 */
	void exitCaseDecl(experimentParser.CaseDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#declaracaoEstrutura}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoEstrutura(experimentParser.DeclaracaoEstruturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#declaracaoEstrutura}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoEstrutura(experimentParser.DeclaracaoEstruturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(experimentParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(experimentParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#arrayInicializacao}.
	 * @param ctx the parse tree
	 */
	void enterArrayInicializacao(experimentParser.ArrayInicializacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#arrayInicializacao}.
	 * @param ctx the parse tree
	 */
	void exitArrayInicializacao(experimentParser.ArrayInicializacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#expressaoLogica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoLogica(experimentParser.ExpressaoLogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#expressaoLogica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoLogica(experimentParser.ExpressaoLogicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoRelacional(experimentParser.ExpressaoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoRelacional(experimentParser.ExpressaoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritmetica(experimentParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritmetica(experimentParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#expressaoMultiplicativa}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoMultiplicativa(experimentParser.ExpressaoMultiplicativaContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#expressaoMultiplicativa}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoMultiplicativa(experimentParser.ExpressaoMultiplicativaContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#expressaoUnaria}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoUnaria(experimentParser.ExpressaoUnariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#expressaoUnaria}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoUnaria(experimentParser.ExpressaoUnariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#expressaoPostfix}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoPostfix(experimentParser.ExpressaoPostfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#expressaoPostfix}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoPostfix(experimentParser.ExpressaoPostfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(experimentParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(experimentParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#primaria}.
	 * @param ctx the parse tree
	 */
	void enterPrimaria(experimentParser.PrimariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#primaria}.
	 * @param ctx the parse tree
	 */
	void exitPrimaria(experimentParser.PrimariaContext ctx);
}