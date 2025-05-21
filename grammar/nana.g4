grammar Nana;

// === Parser rules ===

programa
    : bloco EOF
    ;

bloco
    : linha+ 
    ;

linha
    : declaracao
    | expressao
    | controle
    | funcao_def
    | tratamento_erro
    | importacao
    | comentario
    | NEWLINE
    ;

declaracao
    : varnana_decl
    | constn_decl
    | troca_tipo
    ;

varnana_decl
    : 'varnana' IDENT '=' expressao NEWLINE
    ;

constn_decl
    : 'constn' IDENT '=' expressao NEWLINE
    ;

troca_tipo
    : 'ntroca' tipo 'para' tipo NEWLINE
    ;

expressao
    : expressao operador_aritmetico expressao
    | expressao operador_logico expressao
    | '(' expressao ')'
    | funcao_chamada
    | valor
    | IDENT
    ;

funcao_chamada
    : IDENT '(' args? ')'
    ;

args
    : expressao (',' expressao)*
    ;

controle
    : condicional
    | loop
    ;

condicional
    : 'nanase' expressao ':' bloco ('nanasenao' ':' bloco)?
    ;

loop
    : 'nanaenqt' expressao ':' bloco
    | 'nanaget' IDENT 'em' expressao ':' bloco
    ;

funcao_def
    : 'nanaf' IDENT '(' parametros? ')' ':' bloco
    ;

parametros
    : IDENT (',' IDENT)*
    ;

tratamento_erro
    : 'nanatente' ':' bloco
      ( 'nanaerro' tipo ':' bloco )*
      ( 'nanaerro' ':' bloco )?
      ( 'nanasemerro' ':' bloco )?
      ( 'nanafinal' ':' bloco )?
    ;

importacao
    : 'nanapackage' IDENT NEWLINE
    | 'de' IDENT 'busque' IDENT (',' IDENT)* NEWLINE
    ;

comentario
    : '<n' .*? 'n>'
    ;

valor
    : INT
    | DEC
    | STRING
    | 'true'
    | 'false'
    | lista
    | dicionario
    | setc
    ;

lista
    : 'nanalista' '(' (expressao (',' expressao)*)? ')'
    ;

dicionario
    : 'nanadicio' '(' ( STRING ':' expressao (',' STRING ':' expressao)* )? ')'
    ;

setc
    : 'nanaset' '(' (expressao (',' expressao)*)? ')'
    ;

// === Lexer rules ===

NEWLINE
    : ('\r'? '\n')+
      {skip();}  // No need to emit newline tokens if you want to ignore
    ;

WS
    : [ \t]+ -> skip
    ;

IDENT
    : [a-zA-Z_][a-zA-Z_0-9]*
    ;

INT
    : [0-9]+
    ;

DEC
    : [0-9]+ '.' [0-9]+
    ;

STRING
    : '"' (~["\\] | '\\' .)* '"'
    ;

OPERADOR_ARITMETICO
    : '+' | '-' | '*' | '/' | '%'
    ;

OPERADOR_LOGICO
    : '==' | '!=' | '<' | '<=' | '>' | '>=' | 'e' | 'ou' | 'nao'
    ;

// palavras reservadas (keyword tokens)
fragment
K_VARNANA : 'varnana' ;
fragment
K_CONSTN : 'constn' ;
fragment
K_NANAF : 'nanaf' ;
fragment
K_NANASE : 'nanase' ;
fragment
K_NANASENAO : 'nanasenao' ;
fragment
K_NANAENQT : 'nanaenqt' ;
fragment
K_NANAGET : 'nanaget' ;
fragment
K_NANATENTE : 'nanatente' ;
fragment
K_NANAERRO : 'nanaerro' ;
fragment
K_NANASEMERRO : 'nanasemerro' ;
fragment
K_NANAFINAL : 'nanafinal' ;
fragment
K_NANAPACKAGE : 'nanapackage' ;
fragment
K_DE : 'de' ;
fragment
K_BUSQUE : 'busque' ;
fragment
K_NTROCA : 'ntroca' ;
fragment
K_PARA : 'para' ;

// tipos
tipo
    : 'intn'
    | 'decn'
    | 'letn'
    | 'stgn'
    | 'boon'
    ;

// operadores para facilitar parser
operador_aritmetico
    : '+'
    | '-'
    | '*'
    | '/'
    | '%'
    ;

operador_logico
    : '=='
    | '!='
    | '<'
    | '<='
    | '>'
    | '>='
    | 'e'
    | 'ou'
    | 'nao'
    ;

// constantes booleanas
TRUE : 'true';
FALSE : 'false';

COMMENT
    : '<n' .*? 'n>' -> skip
    ;

// Tokens para separar blocos, indentação (opcional, pois isso geralmente requer pré-processamento)
// Para gramática simples, pode usar NEWLINE e blocos entre ':' e indentação (manual no compilador)

// Ignore tabs and spaces generally
