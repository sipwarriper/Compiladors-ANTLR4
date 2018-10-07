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

TK_PC_CONSTANTS: 'constants';
TK_PC_FCONSTANTS: 'fconstants';

TK_PC_VARIABLES: 'variables';
TK_PC_FVARIABLES: 'fvariables';

TK_PC_TIPUS: 'tipus';
TK_PC_FTIPUS: 'ftipus';

TK_PC_SI: 'si';
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

TK_CONST_REAL: '-'? (('0.' | DIGIT* '.') ('0' | DIGIT)+) ('E' '-'? DIGIT ('0' | DIGIT)*)?;



testingRule: TK_CONST_REAL+? EOF;

