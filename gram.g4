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



//----------FRAGMENTS--------------------------------------

fragment DIGIT: '1'..'9';
fragment LETTER: 'a'..'z';
fragment CAPLETTER: 'A'..'Z';



//--------CONSTANTS-----------------------------------------

TK_CONST_CHAR: '\'' (' ' .. '~' ) | '\\' '\'' '\'';

TK_CONST_REAL: (('0.' | DIGIT* '.') ('0' | DIGIT)+) ('E' '-'? DIGIT ('0' | DIGIT)*)?;

TK_CONST_BOOL: 'false' | 'true';

TK_CONST_INT: (DIGIT ('0' | DIGIT)*) | '0';


//------OPERADORS-----------------------------------------

TK_OP_SUMA: '+';
TK_OP_RESTA: '-';
TK_OP_MULT: '*';
TK_OP_REALDIV: '/';
TK_OP_INTDIV: '\\';
TK_OP_MOD: '%';
TK_OP_EQ: '==';
TK_OP_DIFF: '!=';
TK_OP_GT: '>';
TK_OP_LT: '<';
TK_OP_LOET: '<=';
TK_OP_GOET: '>=';
TK_OP_NEG: 'no';
TK_OP_AND: '&';
TK_OP_O: '|';
TK_OP_IF_THEN_ELSE_CONDITION: '?';
TK_OP_IF_THEN_ELSE_ALTENRATIVE: ':';
TK_OP_VECTOR_OPEN: '[';
TK_OP_VECTOR_CLOSE: ']';
TK_OP_TUPLE: '.';
TK_OP_ASSIGN: ':=';



//-----------Comentaris--------------------------------

TK_COMMENTS: '//' (.)*? ('\n' | EOF);

TK_MULTILINE_COMMENTS: '/*' (.)*? '*/';


testingRule: TK_MULTILINE_COMMENTS+? EOF;

