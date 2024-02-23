grammar experiment;

programa : (declaracao NEWLINE)*;

declaracao : declaracaoVariavel
           | declaracaoFuncao
           | declaracaoEstrutura
           | comentario
	   | arrayInicializacao /*joguei esse array aq pq tava sem nada pra iniciar*/
	   | estruturaControle; /*joguei esse array aq pq tava sem nada pra iniciar*/

// declaracao das variaveis

declaracaoVariavel : tipo ID ';'
                   | tipo ID '=' expressao ';';

tipo : 'int' | 'float' | 'double' | 'char' | 'boolean' | 'vet'; // tipo vet criado para iniciar um array

// funcao
declaracaoFuncao : tipo ID '(' parametros ')' bloco 
		 | tipo ID '(' ')' bloco;

parametros : parametro
           | parametro ',' parametros;

parametro : tipo ID
          | tipo ID '[' ']'
          | tipo '...' ID;

// bloco de codigo
bloco : '{' NEWLINE* (declaracao NEWLINE)* '}';

// logica pra comentario
comentario : '//' ~NEWLINE*
           | '/*' ~'*/'* '*/';

expressao : atribuicao
	  | expressaoLogica;


atribuicao : primaria
	   | array /*joguei esse array aq pq tava sem nada pra iniciar*/
	   | ID '=' expressao
           | ID '+=' expressao
           | ID '-=' expressao
	   | ID '*=' expressao 
	   | ID '/=' expressao
	   | ID '%=' expressao
	   | ID '&&=' expressao 
	   | ID '||=' expressao
	   | ID '=' ID 
	   | ID '+=' ID 
	   | ID '-=' ID 
           | ID '*=' ID 
	   | ID '/=' ID 
 	   | ID '%=' ID 
	   | ID '&&=' ID 
	   | ID '||=' ID;
           // COLOCAR RESTANTE DAS ATRIBUICOES DEPOIS, COLOQUEI ALGUMAS APENAS PRA TESTAR (concluído)


estruturaControle : 'if' '(' expressao ')' bloco
                  | 'if' '(' expressao ')' bloco 'else' bloco
                  | 'while' '(' expressao ')' bloco
		  | 'for' '(' expressao ';' expressao ';' expressao ')' bloco
		  | 'switch' '(' expressao ')' caseLista 
		  | 'break' ';' 
		  | 'continue' ';' 
		  | 'return' expressao ';';
                  // COLOCAR RESTANTE DAS ESTRUTURAS DE CONTROLE DEPOIS... (concluído)

caseLista: (NEWLINE caseDecl)* | caseDecl*;
 
caseDecl: 'case' expressao ':' bloco 
 	| 'default' ':' bloco;

declaracaoEstrutura : 'struct' ID '{' (NEWLINE* declaracaoVariavel NEWLINE)* '}' NEWLINE* ';'; //coloquei esses NEWLINEs

array : ID '[' expressao ']'
      | ID '[' ']';

arrayInicializacao : '{' 'expressaoLista' '}';

// Expressões (Parte 2)

expressaoLogica : expressaoRelacional
                | expressaoLogica '&&' expressaoRelacional
                | expressaoLogica '||' expressaoRelacional
                | '!' expressaoRelacional;

expressaoRelacional : expressaoAritmetica
                    | expressaoAritmetica '>' expressaoAritmetica
		    | expressaoAritmetica '>=' expressaoAritmetica 
		    | expressaoAritmetica '<' expressaoAritmetica 
		    | expressaoAritmetica '<=' expressaoAritmetica 
		    | expressaoAritmetica '!=' expressaoAritmetica 
		    | expressaoAritmetica '==' expressaoAritmetica;
                    // COLOCAR RESTANTE DEPOIS (concluído)

expressaoAritmetica : expressaoMultiplicativa
                    | expressaoAritmetica '+' expressaoMultiplicativa
		    | expressaoAritmetica '-' expressaoMultiplicativa;
                    // COLOCAR RESTANTE DEPOIS (concluído)

expressaoMultiplicativa : expressaoUnaria
                        | expressaoMultiplicativa '*' expressaoUnaria 
			| expressaoMultiplicativa '/' expressaoUnaria 
			| expressaoMultiplicativa '%' expressaoUnaria;
                        // COLOCAR RESTANTE DEPOIS (concluído)

expressaoUnaria : expressaoPostfix
                | '-' expressaoUnaria
                | '++' expressaoPostfix
		| '--' expressaoPostfix;
                // COLOCAR RESTANTE DEPOIS (concluído)

expressaoPostfix : primaria
                 | primaria '[' expressao ']'
                 | primaria '(' argumentos ')'
		 | primaria '.' ID 
  		 | primaria '->' ID;
                 // COLOCAR RESTANTE DEPOIS (concluído)

argumentos : 'expressaoLista'
           | 'vazio';

primaria : ID
	 | array /*joguei esse array aq pq tava sem nada pra iniciar*/
         | NUM_INT
         | NUM_DEC
         | TEXTO
         | '(' expressao ')';

//aqui seriam todas as declaracoes do lexico para fazer o teste

NEWLINE : [\r\n]+ ;

ID : [a-zA-Z_] [a-zA-Z_0-9]*; // Definindo ID

NUM_INT : [0-9]+; // Definindo o token NUM_INT (número inteiro)

NUM_DEC : [0-9]* '.' [0-9]+; // Definindo o token NUM_DEC (número decimal)

TEXTO : '"' ~["]* '"'; // Definindo o token TEXTO (string entre aspas)