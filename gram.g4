grammar gram;

//Regla sintactica: qualsevol token diferent de EOF
inici: (~EOF)+;


//Regles lexiques
TK_WS: ( ' ' | '\ t' | '\n' | '\ r' ) -> skip;

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





fragment DIGIT: '1'..'9';
fragment LETTER: 'a'..'z';
fragment CAPLETTER: 'A'..'Z'

