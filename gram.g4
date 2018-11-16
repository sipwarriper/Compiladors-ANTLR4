grammar gram;

//Regla sintactica: qualsevol token diferent de EOF
inici: (~EOF)+;



//Regles lexiques

TK_WS: ( ' ' | '\t' | '\n' | '\r' ) -> skip;

//---------PARAULES CLAU-----------------------------

TK_PC_PROGRAMA: 'programa';
TK_PC_FPROGRAMA: 'fprograma';

TK_PC_ACCIO: 'accio';
TK_PC_FACCIO: 'faccio';

TK_PC_FUNCIO: 'funcio';
TK_PC_FFUNCIO: 'ffuncio';

TK_PC_RETURN: 'retorna';
TK_PC_PARAM_IN: 'ent';
TK_PC_PARAM_IO: 'entsor';


TK_PC_CONSTANTS: 'constants';
TK_PC_FCONSTANTS: 'fconstants';

TK_PC_VARIABLES: 'variables';
TK_PC_FVARIABLES: 'fvariables';

TK_PC_TIPUS: 'tipus';
TK_PC_FTIPUS: 'ftipus';

TK_PC_TUPLA: 'tupla';
TK_PC_FTUPLA: 'ftupla';

TK_PC_VECTOR: 'vector';
TK_PC_MIDA: 'mida';
TK_PC_INICI: 'inici';

TK_PC_SI: 'si';
TK_PC_LLAVORS: 'llavors';
TK_PC_ALTRAMENT: 'altrament';
TK_PC_FSI: 'fsi';

TK_PC_PER: 'per';
TK_PC_DE: 'de';
TK_PC_FINS: 'fins';
TK_PC_FER: 'fer';
TK_PC_FPER: 'fper';

TK_PC_MENTRE: 'mentre';
TK_PC_FMENTRE: 'fmentre'; // el fer ja el tenim del per, aixi que no ens cal aqui tornar-lo a ficar

//tipus basics

TK_PC_INT: 'enter';
TK_PC_REAL: 'real';
TK_PC_CHAR: 'car';
TK_PC_BOOL: 'boolea';

//llegir i escriure

TK_PC_READ: 'llegir';
TK_PC_WRITE: 'escriure';
TK_PC_WRITELN: 'escriureln';



//----------FRAGMENTS--------------------------------------

fragment DIGIT: '1'..'9';
fragment LETTER: 'a'..'z';
fragment CAPLETTER: 'A'..'Z';



//--------CONSTANTS-----------------------------------------

TK_CONST_CHAR: '\'' ((' ' .. '~' ) | '\\' '\'') '\'';

TK_CONST_REAL: (('0.' | DIGIT* '.') ('0' | DIGIT)+) ('E' '-'? DIGIT ('0' | DIGIT)*)?;

TK_CONST_BOOL: 'false' | 'true';

TK_CONST_INT: (DIGIT ('0' | DIGIT)*) | '0'+;


//------OPERADORS-----------------------------------------

TK_OP_SUMA: '+';
TK_OP_RESTA: '-';
TK_OP_MULT: '*';
TK_OP_REALDIV: '/';
TK_OP_INTDIV: '\\';
TK_OP_MOD: '%';
TK_OP_MINUS: '~';
TK_OP_EQ: '==';
TK_OP_DIFF: '!=';
TK_OP_GT: '>';
TK_OP_LT: '<';
TK_OP_LOET: '<=';
TK_OP_GOET: '>=';
TK_OP_NEG: 'no';
TK_OP_AND: '&';
TK_OP_OR: '|';
TK_OP_QUESTION_MARK: '?';
TK_OP_COLON: ':';
TK_OP_VECTOR_OPEN: '[';
TK_OP_VECTOR_CLOSE: ']';
TK_OP_TUPLE: '.';
TK_OP_ASSIGN: ':=';
TK_OP_QUOTE: '"';

TK_OP_PAR_OPEN: '(';
TK_OP_PAR_CLOSE: ')';



//-----------Comentaris--------------------------------

TK_COMMENTS: '//' (.)*? ('\n' | EOF ) -> skip;

TK_MULTILINE_COMMENTS: '/*' (.)*? '*/' -> skip;

//----------separadors

TK_SEP_COMMA: ',';
TK_SEP_SEMICOLON: ';';

//----------Identificadors

TK_STRING_LITERAL: TK_OP_QUOTE (LETTER|CAPLETTER|DIGIT|'0'|'_' )* TK_OP_QUOTE;
TK_IDENTIFIER: (LETTER | CAPLETTER) (LETTER|CAPLETTER|DIGIT|'0'|'_' )*;


testingRule: TK_STRING_LITERAL EOF; //regla per testejar


// Analisis sintactic

/*
Estructura d'un programa:
* <bloc de declaració de tipus>
* <bloc de declaració de accions i funcions>
* <bloc de declaració de constants>
* programa nom_programa
*   <bloc de declaració de constants>
*   <sentencies>
* fprograma
* <implementació de accions i funcions>
*/


program: typeBlock? funcDecBlock? constBlock? main funcImpBlock?;

main: TK_PC_PROGRAMA varBlock? sentence* TK_PC_FPROGRAMA; //nse si es apropiat dirli sentence pero weno

typeBlock: TK_PC_TIPUS newType* TK_PC_FTIPUS;


newType: TK_IDENTIFIER TK_OP_COLON (basicType | vectorDec | tuplaDec) TK_SEP_SEMICOLON;

basicType: (TK_PC_INT | TK_PC_REAL | TK_PC_CHAR | TK_PC_BOOL);
vectorDec: TK_PC_VECTOR basicType TK_PC_MIDA TK_PC_INT (TK_PC_INICI TK_PC_INT)?;
tuplaDec: TK_PC_TUPLA (basicType TK_IDENTIFIER)+ TK_PC_FTUPLA;

constBlock: TK_PC_CONSTANTS (basicType TK_IDENTIFIER TK_OP_ASSIGN (constValue| TK_STRING_LITERAL)TK_SEP_SEMICOLON)* TK_PC_FCONSTANTS; //preguntar si ha de ser * com al enunciat o + (una o m'es, obligar a no declarar block si no luses)

varBlock: TK_PC_VARIABLES (type TK_IDENTIFIER TK_SEP_SEMICOLON)* TK_PC_FVARIABLES;

funcDecBlock: (accioDec | funcDec)*;

accioDec: TK_PC_ACCIO TK_IDENTIFIER TK_OP_PAR_OPEN params? TK_OP_PAR_CLOSE TK_SEP_SEMICOLON;
funcDec: TK_PC_FUNCIO TK_IDENTIFIER TK_OP_PAR_OPEN params? TK_OP_PAR_CLOSE TK_PC_RETURN basicType TK_SEP_SEMICOLON;
params: (TK_PC_PARAM_IN | TK_PC_PARAM_IO)? type TK_IDENTIFIER(TK_SEP_COMMA (TK_PC_PARAM_IN | TK_PC_PARAM_IO)? type TK_IDENTIFIER)*;//si no s'epecifica si es entrada o entrada-sortida, es entrada per defecte

funcImpBlock: (accioImp | funcImp)*;
accioImp: TK_PC_ACCIO TK_IDENTIFIER TK_OP_PAR_OPEN params? TK_OP_PAR_CLOSE
          varBlock? sentence* TK_PC_FACCIO;
funcImp:  TK_PC_FUNCIO TK_IDENTIFIER TK_OP_PAR_OPEN params? TK_OP_PAR_CLOSE TK_PC_RETURN basicType
          varBlock? sentence*
          TK_PC_RETURN expr TK_SEP_SEMICOLON // es una expresio de tipus basic!
          TK_PC_FFUNCIO;
type: TK_IDENTIFIER | basicType;

assign: TK_IDENTIFIER TK_OP_ASSIGN expr TK_SEP_SEMICOLON;

if_rule: TK_PC_SI expr TK_PC_LLAVORS
            sentence*
            (TK_PC_ALTRAMENT sentence*)?
            TK_PC_FSI;

for_rule: TK_PC_PER TK_IDENTIFIER TK_PC_DE expr TK_PC_FINS expr TK_PC_FER
    sentence*
    TK_PC_FPER;
while_rule: TK_PC_MENTRE expr TK_PC_FER
     sentence*
     TK_PC_FMENTRE;
accio: TK_IDENTIFIER TK_OP_PAR_OPEN (expr (TK_SEP_COMMA expr)*)? TK_OP_PAR_CLOSE TK_SEP_SEMICOLON;

read: TK_PC_READ TK_OP_PAR_OPEN TK_IDENTIFIER TK_OP_PAR_CLOSE TK_SEP_SEMICOLON;
write: TK_PC_WRITE TK_OP_PAR_OPEN (expr | TK_STRING_LITERAL) (TK_SEP_COMMA (expr | TK_STRING_LITERAL))* TK_OP_PAR_CLOSE TK_SEP_SEMICOLON;
writeln: TK_PC_WRITELN TK_OP_PAR_OPEN (expr | TK_STRING_LITERAL) (TK_SEP_COMMA (expr | TK_STRING_LITERAL))* TK_OP_PAR_CLOSE TK_SEP_SEMICOLON;

sentence: (assign|if_rule|for_rule|while_rule|accio|read|write|writeln) ;

/*Expressions
*** un valor constant de tipus basic
*** una constant (son ids)
*** una variable (son ids)
*** un acces a tupla id.id
*** un acces a vector: id[expr]
*** una crida a funcio: id(expr{,expr}*)
*** Una operacio o varies expressions (les operacions estan bastant ordenades al pdf)
*** ternari: a? b:c on a, b i c son expressions
*/

constValue: TK_CONST_INT | TK_CONST_REAL | TK_CONST_CHAR | TK_CONST_BOOL;

tuple: TK_IDENTIFIER TK_OP_TUPLE TK_IDENTIFIER;

vector: TK_IDENTIFIER TK_OP_VECTOR_OPEN expr TK_OP_VECTOR_CLOSE;

func: TK_IDENTIFIER TK_OP_PAR_OPEN (expr (TK_SEP_COMMA expr)*)? TK_OP_PAR_CLOSE;

/*
***  no ∼
***  ∗ / \ %
***  + −
***  == =! < <= > >=
***  & |
***  if −then−else
*/
expr: (logicsDown TK_OP_QUESTION_MARK expr TK_OP_COLON expr) | logicsDown;

logicsDown: (logicUp (TK_OP_AND | TK_OP_OR) logicsDown) | logicUp;

logicUp: (sum (TK_OP_EQ | TK_OP_DIFF | TK_OP_GT | TK_OP_LT | TK_OP_LOET | TK_OP_GOET) logicUp) | sum;

sum: (mult (TK_OP_SUMA | TK_OP_RESTA) sum)|mult;

mult: (neg (TK_OP_MULT | TK_OP_REALDIV | TK_OP_INTDIV | TK_OP_MOD) mult)|neg;

neg: ((TK_OP_NEG | TK_OP_MINUS) neg)| value;

value: constValue|TK_IDENTIFIER|tuple|vector|func|parenthesis;

parenthesis: TK_OP_PAR_OPEN expr TK_OP_PAR_CLOSE;