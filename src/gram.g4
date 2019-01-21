grammar gram;

@header{
    import java.io.*;
    import javafx.util.Pair;
    import java.util.Vector;
}



//******************* Autors: Lluís Trilla i Ismael El Habri
//******************* la regla inicial del programa es la regla program


@parser::members{
    SymTable<Registre> TS = new SymTable<Registre>(1000);
    boolean error = false;
    int contVar=0;
    Bytecode x;
    String classfile;
    Long saltLinia;

    //override method
    public void notifyErrorListeners(Token offendingToken, String msg, RecognitionException e)    {
        super.notifyErrorListeners(offendingToken,msg,e);
        error=true;
    }

    public String toBytecodeType(char t){
        switch(t){
            case 'E': return "I";
            case 'R': return "F";
            case 'B': return "Z";
            case 'C': return "C";
            case 'S': return "S"; //nomes es poden definir constants sense nom
            case 'V': return "V";
            default :  System.out.println("Tipus incorrecte");
                return "0";
        }
    }

    public void setLANSClassFile(String cf){
        classfile=cf.replace(".class","");;
    }

}


//Regla sintactica: qualsevol token diferent de EOF
//inici: (~EOF)+;



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
TK_PC_PARAM_IO:     'entsor';


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
fragment TK_OP_QUOTE: '"';



//--------CONSTANTS-----------------------------------------

TK_CONST_CHAR: '\'' ((' ' .. '~' ) | '\\' '\'') '\'';

TK_CONST_REAL: (('0.' | DIGIT* '.') ('0' | DIGIT)+) ('E' '-'? DIGIT ('0' | DIGIT)*)?;

TK_CONST_BOOL: 'cert' | 'fals';

TK_CONST_INT: (('0' | DIGIT)+);


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

TK_OP_PAR_OPEN: '(';
TK_OP_PAR_CLOSE: ')';



//-----------Comentaris--------------------------------

TK_COMMENTS: '//' (.)*? ('\n' | EOF ) -> skip;

TK_MULTILINE_COMMENTS: '/*' (.)*? '*/' -> skip;

//----------separadors

TK_SEP_COMMA: ',';
TK_SEP_SEMICOLON: ';';

//----------Identificadors

//TK_STRING_LITERAL: '"' ((' ' .. '~' ) | '\\' '\'') * '"';
TK_STRING_LITERAL: TK_OP_QUOTE (~('"'|'\n'|'\\') | ('\\"'))* TK_OP_QUOTE;
TK_IDENTIFIER: (LETTER | CAPLETTER) (LETTER|CAPLETTER|DIGIT|'0'|'_' )*;
test: TK_CONST_REAL;

//testingRule: TK_MULTILINE_COMMENTS EOF; //regla per testejar


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


program
@init{
    x=new Bytecode(classfile);
    saltLinia=x.addConstant("S","\n");
    Vector<Long> trad = new Vector<Long>(10);
}: typeBlock? funcDecBlock? constBlock? main funcImpBlock?;

main @init{
    Vector<Long> trad = new Vector<Long>(10);
}: TK_PC_PROGRAMA TK_IDENTIFIER varBlock? (s=sentence{
    if(!error) trad.addAll($s.trad);
})* TK_PC_FPROGRAMA{
    if(!error){
        trad.add(x.RETURN);
        x.addMainCode(100L,new Long(contVar+3),trad);
        x.write();
    }
}; //nse si es apropiat dirli sentence pero weno

typeBlock: TK_PC_TIPUS newType* TK_PC_FTIPUS;


newType @init{Registre registre = new Registre();} : id=TK_IDENTIFIER TK_OP_COLON (
    reg = basicType {$reg.reg.putLexema($id.text); registre = $reg.reg;}
    | reg2 = vectorDec {$reg2.reg.putLexema($id.text); registre = $reg2.reg;}
    | reg3 = tuplaDec {$reg3.reg.putLexema($id.text); registre = $reg3.reg;}
    ) TK_SEP_SEMICOLON{
        if(TS.existeix($id.text)){ //no podem tenir dos tipus amb el mateix nom!
            error = true;
            System.out.println("Error, dos tipus amb el mateix nom detectats a la linia " + $id.line);
        }
        else{
            TS.inserir($id.text, registre);
        }
    };

basicType returns [Registre reg]:
    TK_PC_INT { $reg = new Registre("", "enter"); }
    | TK_PC_REAL { $reg = new Registre("", "real"); }
    | TK_PC_CHAR { $reg = new Registre("", "car"); }
    | TK_PC_BOOL { $reg = new Registre("", "boolea"); };


vectorDec returns [Registre reg]: TK_PC_VECTOR bt=basicType{
    $reg = new Registre ("", $bt.reg.getTipus(), "vector");
} TK_PC_MIDA TK_CONST_INT (TK_PC_INICI TK_CONST_INT)?;

//todo: actualitzar taula de simbols de forma que els camps passen a ser variables amb id "tupla_camp", aixi que el campsAddicionals passa a ser un vector<Pair<String, null>>
tuplaDec returns [Registre reg] @init{Vector<Pair<String,String>> camps = new Vector<Pair<String,String>>(10); }: TK_PC_TUPLA (bt = basicType id = TK_IDENTIFIER TK_SEP_SEMICOLON{
    camps.add(new Pair<>($bt.reg.getTipus(), $id.text));
})+ TK_PC_FTUPLA{
    $reg = new Registre("", null, "tupla");
    $reg.putCampsAddicionals(camps); };

constBlock: TK_PC_CONSTANTS (bt=basicType id=TK_IDENTIFIER TK_OP_ASSIGN c = constValue{
    char tipusCar = $bt.reg.getTipus().toUpperCase().charAt(0);
    if((tipusCar == $c.tipus || (tipusCar == 'R' && $c.tipus == 'E') ) && !TS.existeix($id.text)){
        String cont = $c.text;
        if (tipusCar == 'C') cont = cont.replace("'","");
        else if (tipusCar == 'B') cont = cont.equals("cert") ? "Cert" : "Fals" ;
        Long idConst = x.addConstName($id.text, toBytecodeType(tipusCar), cont);
        Registre registre = new Registre($id.text, $bt.reg.getTipus(), "const", idConst);
        TS.inserir($id.text, registre);
    }
    else if(TS.existeix($id.text)){
        error = true;
        System.out.println("Error, dos constants amb el mateix nom detectats a la linia " + $id.line);
    }
    else{
        error = true;
        System.out.println("Error de tipus a la linia " + $id.line + " càsting il·legal");
    }
} TK_SEP_SEMICOLON)* TK_PC_FCONSTANTS; //preguntar si ha de ser * com al enunciat o + (una o m'es, obligar a no declarar block si no luses)

varBlock
//@init{
//     Registre rTest = new Registre ("UnAlias", "enter","alias");
//     TS.inserir("UnAlias", rTest);
//}
: TK_PC_VARIABLES (t=type id=TK_IDENTIFIER TK_SEP_SEMICOLON{
    if ($t.reg!=null){
        String tipus = null;
        if ($t.reg.getLexema().equals("")){ tipus = $t.reg.getTipus();}
        else { tipus = $t.reg.getLexema();}
        if(!TS.existeix($id.text)){
            Registre registre = new Registre($id.text, tipus, "var", new Long(contVar));
            contVar++;
            TS.inserir($id.text, registre);
        }
        else{
            error = true;
            System.out.println("Error, no es pot declarar el mateix simbol (" + $id.text + ") a la linia " + $id.line);
        }
    }
})* TK_PC_FVARIABLES;

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


type returns [Registre reg]: id = TK_IDENTIFIER {
        if(!TS.existeix($id.text)){
            error = true;
            System.out.println("Error, "+ $id.text +" no existeix. Linia " + $id.line);
        }
        else {
            $reg = TS.obtenir($id.text);
        }
    }| bt = basicType{$reg = $bt.reg;};

assign returns [Vector<Long> trad]: (id = TK_IDENTIFIER/*| tuple | vector*/ )TK_OP_ASSIGN e=expr{
    if (!error){
        if (!(TS.existeix($id.text))){
            error=true;
            System.out.println("Variable " +$id.text+  " inexistent a la linea " + $id.line);
        }
        else if(!TS.obtenir($id.text).getTipusLexema().equals("var")){
            error=true;
            System.out.println($id.text +  " no es pot editar a la linea " + $id.line);
        }
        else{
            Registre r = TS.obtenir($id.text);
            char tipus = r.getTipus().toUpperCase().charAt(0);
            $trad = $e.trad;
            if(tipus == $e.tipus){
                switch(tipus){
                     case 'E':
                        $trad.add(x.ISTORE);
                        break;
                     case 'R':
                        $trad.add(x.FSTORE);
                        break;
                     case 'C':
                        $trad.add(x.ISTORE);
                        break;
                     case 'B':
                        $trad.add(x.ISTORE);
                        break;
                }
                $trad.add(new Long(r.getAdreca()));
            }
            else if(tipus == 'R' && $e.tipus == 'E'){
                $trad.add(x.FSTORE);
                $trad.add(new Long(r.getAdreca()));
            }
            else{
                error=true;
                System.out.println("Error de tipus a la linea " + $id.line);
            }
        }
    }
} TK_SEP_SEMICOLON;


if_rule returns [Vector<Long> trad]
@init{
    Vector<Long> trad2 = new Vector<Long>(10);
    Vector<Long> trad3 = new Vector<Long>(10);
}
: s=TK_PC_SI t1=expr{
              if($t1.tipus != 'B'){ //la condició ha de ser booleana
                  error = true;
                  System.out.println("Error de tipus detectat a la linia " + $s.line + ":la condició del if ha de ser booleana." + $t1.text);
              }
          } TK_PC_LLAVORS
            (sen=sentence{if(!error) trad2.addAll($sen.trad);})*
            (TK_PC_ALTRAMENT (sen2=sentence{if(!error)trad3.addAll($sen2.trad);})*)?
            TK_PC_FSI{
                if(!error){
                    $trad=$t1.trad;
                    $trad.add(x.IFEQ);
                    Long salt=trad2.size()+6L;
                    $trad.add(x.nByte(salt,2));
                    $trad.add(x.nByte(salt,1));
                    $trad.addAll(trad2);
                    $trad.add(x.GOTO);
                    salt=trad3.size()+3L;
                    $trad.add(x.nByte(salt,2));
                    $trad.add(x.nByte(salt,1));
                    $trad.addAll(trad3);
                }
            };

for_rule returns [Vector<Long> trad] @init{
    Vector<Long> trad2 = new Vector<Long>(10);
}: TK_PC_PER id=TK_IDENTIFIER TK_PC_DE t1=expr TK_PC_FINS t2=expr{
        if($t1.tipus != 'E' || $t2.tipus !='E'){
           error = true;
           System.out.println("Error de tipus detectat a la linia " + $id.line + ":els valors dels intervals del for han de ser enters");
       } else if(!TS.existeix($id.text)){
           error = true;
           System.out.println("Variable " + $id.text + " no existeix. Linia " + $id.line);

       }
   } TK_PC_FER
    (sen=sentence{if(!error) trad2.addAll($sen.trad);})*
    TK_PC_FPER{

        if(!error){
            Registre r = TS.obtenir($id.text);
            char tipus = r.getTipus().toUpperCase().charAt(0);
            $trad = $t1.trad;
            if(tipus == $t1.tipus && r.getTipusLexema().equals("var")){
                $trad.add(x.ISTORE);
                $trad.add(new Long(r.getAdreca()));

                $trad.add(x.ILOAD);
                $trad.add(new Long(r.getAdreca()));

                $trad.addAll($t2.trad);

                $trad.add(x.IF_ICMPGT);
                Long salt=trad2.size()+9L;
                $trad.add(x.nByte(salt,2));
                $trad.add(x.nByte(salt,1));
                $trad.addAll(trad2);
                $trad.add(x.IINC);
                $trad.add(new Long(r.getAdreca()));
                $trad.add(1L);
                //salt=0L-$trad.size()+$t1.trad.size()+3L;
                salt=0L-trad2.size()-$t2.trad.size()-8L;
                $trad.add(x.GOTO);
                $trad.add(x.nByte(salt,2));
                $trad.add(x.nByte(salt,1));
                //APANYO
                $trad.add(x.IINC);
                $trad.add(new Long(r.getAdreca()));
                $trad.add(-1L);


            }
            else{
                error=true;
                System.out.println("Error de tipus a la linea " + $id.line);
            }
        }

    };

while_rule returns [Vector<Long> trad]
@init{
    Vector<Long> trad2 = new Vector<Long>(10);
}
: s=TK_PC_MENTRE t1 = expr{
          if($t1.tipus != 'B'){ //la condició ha de ser booleana
              error = true;
              System.out.println("Error de tipus detectat a la linia " + $s.line + ":la condició del while ha de ser booleana.");
          }
      }TK_PC_FER
     (sen=sentence{ if(!error) trad2.addAll($sen.trad);})*
     TK_PC_FMENTRE{
         if(!error){
                $trad=$t1.trad;
                $trad.add(x.IFEQ);
                Long salt=trad2.size()+6L;
                $trad.add(x.nByte(salt,2));
                $trad.add(x.nByte(salt,1));
                $trad.addAll(trad2);
                salt=0L-$trad.size();
                $trad.add(x.GOTO);
                $trad.add(x.nByte(salt,2));
                $trad.add(x.nByte(salt,1));
         }
     };



accio: TK_IDENTIFIER TK_OP_PAR_OPEN (expr (TK_SEP_COMMA expr)*)? TK_OP_PAR_CLOSE TK_SEP_SEMICOLON;

read returns [Vector<Long> trad] @init{
    $trad = new Vector<Long>(10);
}: TK_PC_READ TK_OP_PAR_OPEN id=TK_IDENTIFIER{
    if(TS.existeix($id.text)){
        Registre reg = TS.obtenir($id.text);
        if(TS.obtenir($id.text).getTipusLexema().equals("var")){
            char tipus = reg.getTipus().toUpperCase().charAt(0);
            if(reg.getTipus().equals("enter") || reg.getTipus().equals("real") || reg.getTipus().equals("car") || reg.getTipus().equals("boolea")){
                tipus = reg.getTipus().toUpperCase().charAt(0);
            }
            else{ //tipus es un alias
                Registre reg2 = TS.obtenir(reg.getTipus());
                tipus = reg2.getTipus().toUpperCase().charAt(0);
            }
            $trad.add(x.INVOKESTATIC);
            switch(tipus){
                 case 'E':
                     $trad.add(x.nByte(x.mGetInt,2));
                     $trad.add(x.nByte(x.mGetInt,1));
                     $trad.add(x.ISTORE);
                     break;
                 case 'R':
                     $trad.add(x.nByte(x.mGetFloat,2));
                     $trad.add(x.nByte(x.mGetFloat,1));
                     $trad.add(x.FSTORE);
                     break;
                 case 'C':
                     $trad.add(x.nByte(x.mGetChar,2));
                     $trad.add(x.nByte(x.mGetChar,1));
                     $trad.add(x.ISTORE);
                     break;
                 case 'B':
                     $trad.add(x.nByte(x.mGetBoolean,2));
                     $trad.add(x.nByte(x.mGetBoolean,1));
                     $trad.add(x.ISTORE);
                     break;
            }
            $trad.add(new Long(reg.getAdreca()));
        }
        else{
              error=true;
              System.out.println($id.text +  " no es pot editar a la linea " + $id.line);
        }
    } else{
            error=true;
            System.out.println("Variable " +$id.text+  " inexistent a la linea " + $id.line);

    }
}TK_OP_PAR_CLOSE TK_SEP_SEMICOLON;




write returns [Vector<Long> trad] @init{
          $trad = new Vector<Long>(10);
      }:  TK_PC_WRITE TK_OP_PAR_OPEN (e=expr{
             if(!error){
                 $trad = $e.trad;
                 $trad.add(x.INVOKESTATIC);
                 switch($e.tipus){
                     case 'E':
                        $trad.add(x.nByte(x.mPutInt,2));
                        $trad.add(x.nByte(x.mPutInt,1));
                        break;
                     case 'R':
                        $trad.add(x.nByte(x.mPutFloat,2));
                        $trad.add(x.nByte(x.mPutFloat,1));
                        break;
                     case 'C':
                        $trad.add(x.nByte(x.mPutChar,2));
                        $trad.add(x.nByte(x.mPutChar,1));
                        break;
                     case 'B':
                        //$trad.add(x.I2B); //castajem enter a byte
                        $trad.add(x.nByte(x.mPutBoolean,2));
                        $trad.add(x.nByte(x.mPutBoolean,1));
                        break;
                 }
             }
      } | s=TK_STRING_LITERAL{
             Long tempString = x.addConstant("S",$s.text.replace("\"", ""));
             $trad.add(x.LDC_W); //carragem la string a la pila
             $trad.add(x.nByte(tempString,2));
             $trad.add(x.nByte(tempString,1));
             $trad.add(x.INVOKESTATIC);
             $trad.add(x.nByte(x.mPutString,2));
             $trad.add(x.nByte(x.mPutString,1));
      }) (TK_SEP_COMMA (e1=expr{
            if(!error){
                $trad = $e1.trad;
                $trad.add(x.INVOKESTATIC);
                switch($e1.tipus){
                     case 'E':
                        $trad.add(x.nByte(x.mPutInt,2));
                        $trad.add(x.nByte(x.mPutInt,1));
                        break;
                     case 'R':
                        $trad.add(x.nByte(x.mPutFloat,2));
                        $trad.add(x.nByte(x.mPutFloat,1));
                        break;
                     case 'C':
                        $trad.add(x.nByte(x.mPutChar,2));
                        $trad.add(x.nByte(x.mPutChar,1));
                        break;
                     case 'B':
                        $trad.add(x.nByte(x.mPutBoolean,2));
                        $trad.add(x.nByte(x.mPutBoolean,1));
                        break;
                }
            }
      } | s1=TK_STRING_LITERAL{
              Long tempString = x.addConstant("S",$s1.text.replace("\"", ""));
              $trad.add(x.LDC_W); //carragem la string a la pila
              $trad.add(x.nByte(tempString,2));
              $trad.add(x.nByte(tempString,1));
              $trad.add(x.INVOKESTATIC);
              $trad.add(x.nByte(x.mPutString,2));
              $trad.add(x.nByte(x.mPutString,1));
      }))* TK_OP_PAR_CLOSE TK_SEP_SEMICOLON;


writeln returns [Vector<Long> trad] @init{
    $trad = new Vector<Long>(10);
} @after{
    $trad.add(x.LDC_W);
    $trad.add(x.nByte(saltLinia,2));
    $trad.add(x.nByte(saltLinia,1));
    $trad.add(x.INVOKESTATIC);
    $trad.add(x.nByte(x.mPutString,2));
    $trad.add(x.nByte(x.mPutString,1));

}: TK_PC_WRITELN TK_OP_PAR_OPEN( (e=expr{
        if(!error){
            $trad = $e.trad;
            $trad.add(x.INVOKESTATIC);
            switch($e.tipus){
                 case 'E':
                    $trad.add(x.nByte(x.mPutInt,2));
                    $trad.add(x.nByte(x.mPutInt,1));
                    break;
                 case 'R':
                    $trad.add(x.nByte(x.mPutFloat,2));
                    $trad.add(x.nByte(x.mPutFloat,1));
                    break;
                 case 'C':
                    $trad.add(x.nByte(x.mPutChar,2));
                    $trad.add(x.nByte(x.mPutChar,1));
                    break;
                 case 'B':
                    $trad.add(x.nByte(x.mPutBoolean,2));
                    $trad.add(x.nByte(x.mPutBoolean,1));
                    break;
            }
        }
} | s=TK_STRING_LITERAL{
    Long tempString = x.addConstant("S",$s.text.replace("\"", ""));
    $trad.add(x.LDC_W); //carragem la string a la pila
    $trad.add(x.nByte(tempString,2));
    $trad.add(x.nByte(tempString,1));
    $trad.add(x.INVOKESTATIC);
    $trad.add(x.nByte(x.mPutString,2));
    $trad.add(x.nByte(x.mPutString,1));
}) (TK_SEP_COMMA (e1=expr{
        if(!error){
            $trad = $e1.trad;
            $trad.add(x.INVOKESTATIC);
            switch($e1.tipus){
                 case 'E':
                    $trad.add(x.nByte(x.mPutInt,2));
                    $trad.add(x.nByte(x.mPutInt,1));
                    break;
                 case 'R':
                    $trad.add(x.nByte(x.mPutFloat,2));
                    $trad.add(x.nByte(x.mPutFloat,1));
                    break;
                 case 'C':
                    $trad.add(x.nByte(x.mPutChar,2));
                    $trad.add(x.nByte(x.mPutChar,1));
                    break;
                 case 'B':
                    $trad.add(x.I2B); //castajem enter a boolea
                    $trad.add(x.nByte(x.mPutBoolean,2));
                    $trad.add(x.nByte(x.mPutBoolean,1));
                    break;
            }
        }
} | s1=TK_STRING_LITERAL{
    Long tempString = x.addConstant("S",$s1.text.replace("\"", ""));
    $trad.add(x.LDC_W); //carragem la string a la pila
    $trad.add(x.nByte(tempString,2));
    $trad.add(x.nByte(tempString,1));
    $trad.add(x.INVOKESTATIC);
    $trad.add(x.nByte(x.mPutString,2));
    $trad.add(x.nByte(x.mPutString,1));
}))*)? TK_OP_PAR_CLOSE TK_SEP_SEMICOLON;

sentence returns [Vector<Long> trad]: (a=assign{$trad=$a.trad;}
    | i=if_rule{$trad=$i.trad;}
    | f=for_rule{$trad=$f.trad;}
    | w=while_rule{$trad=$w.trad;}
    | accio
    | r=read {$trad = $r.trad;}
    | wr=write {$trad = $wr.trad;}
    | wr2=writeln{$trad = $wr2.trad;}) ;

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

constValue returns [char tipus, Vector<Long> trad] @init{
    $trad = new Vector<Long> (10);
}: //todo: repassar float
    a=TK_CONST_INT {
        $tipus = 'E';
        $trad.add(x.BIPUSH);
        $trad.add(new Long($a.text));
    }
    | b=TK_CONST_REAL {
        $tipus = 'R';
        Long constTemp = x.addConstant("F",$b.text);
        $trad.add(x.LDC_W);
        $trad.add(x.nByte(constTemp,2));
        $trad.add(x.nByte(constTemp,1));
        }
    | c=TK_CONST_CHAR {
        $tipus = 'C';
        $trad.add(x.BIPUSH);
        $trad.add(new Long($c.text.replace("'", "").charAt(0)));
        }
    | d=TK_CONST_BOOL {
        $tipus = 'B';
        $trad.add(x.BIPUSH);
        if($d.text.equals("cert")){
            $trad.add(1l);
        }
        else{
            $trad.add(0l);
        }
    };

tuple returns [char tipus]: id=TK_IDENTIFIER TK_OP_TUPLE camp=TK_IDENTIFIER{
    if(TS.existeix($id.text)){
        Registre reg = TS.obtenir($id.text);
        Vector<Pair<String,String>> camps = reg.getCampsAddicionals();
        boolean trobat = false;
        int i = 0;
        Pair<String, String> c = null;
        while (trobat != false && i < camps.size()){
            c = camps.get(i);
            if (c.getValue().equals($camp.text)) trobat = true;
            i++;
        }
        if (!trobat) {
            error = true;
            System.out.println("Error: la tupla " + $id.text + " no te el camp " + $camp.text + " a la linea: " + $id.line);
        }
        else{
            $tipus = c.getKey().toUpperCase().charAt(0);
        }
    }
    else{
        error = true;
        System.out.println("Error: la tupla " + $id.text + " no existeix, a la linea: " + $id.line);
    }
};

vector returns [char tipus]: id=TK_IDENTIFIER TK_OP_VECTOR_OPEN t1=expr{
         if($t1.tipus != 'E'){
             error = true;
             System.out.println("Error de tipus detectat a la linia " + $id.line + ": els indexs de vectors han de ser enters.");
         }
         if(TS.existeix($id.text)){
            Registre reg = TS.obtenir($id.text);
            $tipus = reg.getTipus().toUpperCase().charAt(0);
         }
         else{
            error = true;
            System.out.println("Error: el vector " + $id.text + " no existeix, a la linea: " + $id.line);
         }
     } TK_OP_VECTOR_CLOSE;

func: TK_IDENTIFIER TK_OP_PAR_OPEN (expr (TK_SEP_COMMA expr)*)? TK_OP_PAR_CLOSE;

/*
***  no ∼
***  ∗ / \ %
***  + −
***  == =! < <= > >=
***  & |
***  if −then−else
*/



expr returns [char tipus, Vector<Long> trad]:
    (boolea=logicsDown
        (s=TK_OP_QUESTION_MARK t1 = logicsDown {
            $tipus = $t1.tipus;
            if($boolea.tipus != 'B'){ //la condició ha de ser booleana
                error = true;
                System.out.println("Error de tipus detectat a la linia " + $s.line + ": La condició d'un ternari ha de ser booleana");
            }
        }
        s=TK_OP_COLON t2 = logicsDown {
                if($t1.tipus != $t2.tipus && !(($t1.tipus == 'E' && $t2.tipus == 'R')||($t1.tipus == 'R' && $t2.tipus == 'E'))){
                //cast de real a enter
                    error = true;
                    System.out.println("Error de tipus detectat a la linia " + $s.line + ": Els tipus del ternari no casen");
                }
                else if(!error){
                    $trad = $boolea.trad;
                    Vector<Long> trad2 = $t1.trad;
                    Vector<Long> trad3 = $t2.trad;
                    $trad.add(x.IFEQ);
                    Long salt = trad2.size()+6L;
                    $trad.add(x.nByte(salt,2));
                    $trad.add(x.nByte(salt,1));
                    $trad.addAll(trad2);
                    $trad.add(x.GOTO);
                    salt=trad3.size()+3L;
                    $trad.add(x.nByte(salt,2));
                    $trad.add(x.nByte(salt,1));
                    $trad.addAll(trad3);
                }
            })+)
    | t1 = logicsDown {$tipus = $t1.tipus;  $trad = $t1.trad;};

logicsDown returns [char tipus, Vector<Long> trad]:
    (t1=logicUp{$tipus = 'B';}
    (s=(TK_OP_AND | TK_OP_OR) t2=logicUp {
                 if($t1.tipus != 'B' && $t2.tipus != 'B'){
                 //cast de real a enter
                     error = true;
                     System.out.println("Error de tipus detectat a la linia " + $s.line + ": Els tipus de operació lògica no casen");
                 }
                 if(!error){
                    $trad = $t1.trad;
                    $trad.addAll($t2.trad);
                    if($s.text.equals("&")){
                        $trad.add(x.IAND);
                    }
                    else if($s.text.equals("|")){
                        $trad.add(x.IOR);
                    }
                 }
             })+)
    | t=logicUp{$tipus = $t.tipus;  $trad = $t.trad;};

logicUp returns [char tipus, Vector<Long> trad]:
    (t1=sum {$tipus = 'B';}
        (s=(TK_OP_EQ | TK_OP_DIFF | TK_OP_GT | TK_OP_LT | TK_OP_LOET | TK_OP_GOET) t2=sum {
              if($s.text.equals("==") || $s.text.equals("!=")) {
                if(($t1.tipus != $t2.tipus) && !(($t1.tipus == 'E' && $t2.tipus == 'R')||($t1.tipus == 'R' && $t2.tipus == 'E'))){
                    // == i != esta definit sobre tots els tipus reals
                    error = true;
                    System.out.println("Error de tipus detectat a la linia " + $s.line +": El tipus del comparador lògic no casen (cas1)");
                    break;
                }
                else{
                    if((($t1.tipus=='R' || $t2.tipus=='R') && ($t1.tipus=='E' || $t2.tipus=='E')) || ($t1.tipus=='R' && $t2.tipus=='R')){

                        $trad=$t1.trad;
                        if($t1.tipus=='E'){
                            $trad.add(x.I2F);
                        }

                        $trad.addAll($t2.trad);
                        if($t2.tipus=='E'){
                            $trad.add(x.I2F);
                        }

                        $trad.add(x.FCMPG);

                        if($s.text.equals("==")){
                            $trad.add(x.IFEQ);
                        }
                        else{
                            $trad.add(x.IFNE);
                        }
                    }else{
                        $trad=$t1.trad;
                        $trad.addAll($t2.trad);
                        if($s.text.equals("==")){
                            $trad.add(x.IF_ICMPEQ);
                        }
                        else{
                            $trad.add(x.IF_ICMPNE);
                        }
                    }

                }
              } else if(($t1.tipus != 'E' || $t1.tipus != 'R') && ($t2.tipus != 'E' || $t2.tipus != 'R')&& ($t2.tipus != 'E' || $t2.tipus != 'E')&& ($t2.tipus != 'R' || $t2.tipus != 'R')){
                //nomes es pot usar en reals i enters, aixi que si son diferents ferem casting a real.
                    error = true;
                    System.out.println("Error de tipus detectat a la linia " + $s.line + ": El tipus del comparador lògic no casen (cas2)");
                    break;
              }
              else{
                $trad=$t1.trad;
                if($t1.tipus=='E'){
                   $trad.add(x.I2F);
                }
                $trad.addAll($t2.trad);
                if($t2.tipus=='E'){
                   $trad.add(x.I2F);
                }
                $trad.add(x.FCMPG);
                switch($s.text){
                    case ">":
                        $trad.add(x.IFGT);
                        break;
                    case "<":
                        $trad.add(x.IFLT);
                        break;
                    case "<=":
                        $trad.add(x.IFLE);
                        break;
                    case ">=":
                        $trad.add(x.IFGE);
                        break;
                }
                }
                Long salt=8L;
                $trad.add(x.nByte(salt,2));
                $trad.add(x.nByte(salt,1));

                $trad.add(x.BIPUSH);
                $trad.add(new Long(0));

                $trad.add(x.GOTO);
                salt=5L;
                $trad.add(x.nByte(salt,2));
                $trad.add(x.nByte(salt,1));

                $trad.add(x.BIPUSH);
                $trad.add(new Long(1));

          })+)
        | t=sum{$tipus = $t.tipus;  $trad = $t.trad;};

sum returns [char tipus, Vector<Long> trad]:
    (t1=mult(s=(TK_OP_SUMA | TK_OP_RESTA) t2=mult{
        $trad = $t1.trad;
          if(($t1.tipus == 'E' || $t1.tipus == 'R') && ($t2.tipus == 'R' || $t2.tipus == 'E') && $t1.tipus != $t2.tipus){
              $tipus = 'R';
          } else if($t1.tipus == $t2.tipus && ($t1.tipus == 'E' || $t1.tipus == 'R')){
              $tipus = $t1.tipus;
          } else{
              error = true;
              System.out.println("Error de tipus detectat a la linia " + $s.line + ": El tipus de la suma/resta no casen");
          }
          if(!error){
              if($t1.tipus == 'E' && $t2.tipus == 'R') $trad.add(x.I2F);
              $trad.addAll($t2.trad);
              if($t2.tipus == 'E' && $t1.tipus == 'R') $trad.add(x.I2F);
              if($tipus == 'E'){
                    if ($s.text.equals("+")) $trad.add(x.IADD);
                    else $trad.add(x.ISUB);
              }
              else{
                    if ($s.text.equals("+")) $trad.add(x.FADD);
                    else $trad.add(x.FSUB);
              }
          }
    })+)
    | t=mult{$tipus = $t.tipus; $trad = $t.trad;};

mult returns [char tipus, Vector<Long> trad]:
    (t1=neg(s=(TK_OP_MULT | TK_OP_REALDIV | TK_OP_INTDIV | TK_OP_MOD) t2=neg{
        $trad = $t1.trad;
          if(($s.text.equals("%") || $s.text.equals("\\")) && ($t1.tipus == 'E' && $t2.tipus == 'E')) {
                $tipus = 'E';
          } else if ($s.text.equals("/") && ($t1.tipus == 'E' || $t1.tipus == 'R') && ($t2.tipus == 'E' || $t2.tipus == 'R')) {
                $tipus = 'R';
          } else if ($s.text.equals("*") && ($t1.tipus == 'E' || $t1.tipus == 'R') && ($t2.tipus == 'E' || $t2.tipus == 'R') && $t1.tipus != $t2.tipus) {
                $tipus = 'R';
          } else if ($s.text.equals("*") && $t1.tipus == $t2.tipus && ($t1.tipus == 'E' || $t2.tipus == 'R')) {
                $tipus = $t1.tipus;
          } else {
                error = true;
                System.out.println("Error de tipus detectat a la linia " + $s.line + ": El tipus de l'operador " + $s.text +" no casen");
          }
          if(!error){
                if($s.text.equals("%")){
                    $trad.addAll($t2.trad);
			        $trad.add(x.IREM);
                }
                else if($s.text.equals("\\")){
                    $trad.addAll($t2.trad);
                    $trad.add(x.IDIV);
                }
                else if($s.text.equals("/")){
                    if($t1.tipus == 'E') $trad.add(x.I2F);
                    $trad.addAll($t2.trad);
                    if($t2.tipus == 'E') $trad.add(x.I2F);
                    $trad.add(x.FDIV);
                }
                else if($s.text.equals("*")){
                    if($t1.tipus == 'R' || $t2.tipus == 'R'){
                        if($t1.tipus == 'E') $trad.add(x.I2F);
                        $trad.addAll($t2.trad);
                        if($t2.tipus == 'E') $trad.add(x.I2F);
                        $trad.add(x.FMUL);
                    }
                    else{
                        $trad.addAll($t2.trad);
                        $trad.add(x.IMUL);
                    }
                }
          }
      })+)
    | t=neg {$tipus = $t.tipus;  $trad = $t.trad;};

neg returns [char tipus, Vector<Long> trad]:
    (s=(TK_OP_NEG | TK_OP_MINUS) t=value{
        $tipus = $t.tipus;
        $trad = $t.trad;
        if(($s.text.equals("~") && !($t.tipus == 'E' || $t.tipus == 'R' )) || ($s.text.equals("no") && $t.tipus != 'B')){
              error = true;
              System.out.println("Error de tipus detectat a la linia " + $s.line + ": El tipus del unari és incorrecte");
        }
        else{
            $trad = $t.trad;
            if($tipus == 'R' && $s.text.equals("~")){
                $trad.add(x.FNEG);
            }
            else if ($s.text.equals("~")){
                $trad.add(x.INEG);
            }
            else if ($s.text.equals("no")){
                $trad.add(x.BIPUSH);
                $trad.add(1l);
                $trad.add(x.IXOR);
            }
        }
    })
    | t=value {$tipus=$t.tipus;  $trad = $t.trad;};

value returns [char tipus, Vector<Long> trad]:
//TODO: semantic value incomplet
//TODO: provar id, tuple i vector
    t1 = constValue {$tipus = $t1.tipus; $trad = $t1.trad;}
    | id=TK_IDENTIFIER{
        $trad = new Vector<Long> (10);
        if(TS.existeix($id.text) && (TS.obtenir($id.text).getTipusLexema().equals("var") || TS.obtenir($id.text).getTipusLexema().equals("const"))){
            Registre reg = TS.obtenir($id.text);
            if(reg.getTipus().equals("enter") || reg.getTipus().equals("real") || reg.getTipus().equals("car") || reg.getTipus().equals("boolea")){
                $tipus = reg.getTipus().toUpperCase().charAt(0);
            }
            else{ //tipus es un alias
                Registre reg2 = TS.obtenir(reg.getTipus());
                $tipus = reg2.getTipus().toUpperCase().charAt(0);
            }
            if(reg.getTipusLexema().equals("var")){
                if($tipus != 'R'){
                    $trad.add(x.ILOAD);
                }
                else{
                    $trad.add(x.FLOAD);
                }
                $trad.add(new Long(reg.getAdreca()));
            }
            else if (reg.getTipusLexema().equals("const")){
                $trad.add(x.LDC_W);
                Long constTemp = new Long(reg.getAdreca());
                $trad.add(x.nByte(constTemp,2));
                $trad.add(x.nByte(constTemp,1));
            }
        }
        else{
            error = true;
            System.out.println("Error: " + $id.text + " no existeix: " + $id.line);
        }
    }
    |t2 = tuple {$tipus = $t2.tipus;}
    |t3 = vector {$tipus = $t3.tipus;}
    | func
    | t= parenthesis {$tipus = $t.tipus; $trad = $t.trad;};

parenthesis returns [char tipus, Vector<Long> trad]: TK_OP_PAR_OPEN t=expr {
    $tipus = $t.tipus;
    $trad = $t.trad;
} TK_OP_PAR_CLOSE;