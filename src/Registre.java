// Josep Suy abril 2007


import javafx.util.Pair;

import java.util.Vector;

public class Registre  {

	String lexema;
	String tipusLexema; //tipus de lexema (alies, funcio, tupla, vector, variable, constant)
	String tipus;
	    /* si var o const, el tipus d'aquesta
	    *  si alias, el tipus real
	    *  si funcio, el tipus de retorn, si accio "void"
	    *  si tupla, null
	    *  si vector, el tipu dels elements
	     */
	//Vector<String> tipusParams; //falta saberne coses com ara si cal ficar-hi el nom, i si inout o no
	Vector<Pair<String,String>> campsTupla;
	int adreca;


    public Registre() {
        lexema="";
        tipus=null;
        adreca=0;
    }


    public Registre(String l) {
        lexema=l;
        tipus="I";
        adreca=0;
    }

    public Registre(String l, String t) {
        lexema=l;
        tipus=t;
        adreca=0;
    }

    public Registre(String l, String t, int a) {
        lexema=l;
        tipus=t;
        adreca=a;
    }

    public String getLexema() {
        return (lexema);
        }
    public String getTipus() {
        return (tipus);
        }
    public Integer getAdreca() {
        return (adreca);
        }

    public void putLexema(String l) {
        lexema=l;
        }
    public void putTipus(String t) {
        tipus=t;
        }
    public void putAdreca(int a) {
        adreca=a;
        }

}
