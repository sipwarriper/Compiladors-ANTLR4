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

	Vector<Pair<String,String>> campsAddicionals;
	    /* si es una tupla, cada element del vector representa un camp de la tupla, sent el key el tipus i value el nom
	    *  si es una funcio, cada element del vector representa un perametre, sent el key el tipus i el value const o var en funcio de si es paramtre entrada o entradasortida
	    */
	int adreca;


    public Registre() {
        lexema="";
        tipus=null;
        adreca=0;
    }


    public Registre(String l) {
        lexema=l;
        tipus=null;
        adreca=0;
        tipusLexema = null;
    }

    public Registre(String l, String t) {
        lexema=l;
        tipus=t;
        adreca=0;
        tipusLexema = null;
    }

    public Registre(String l, String t, String t2) {
        lexema=l;
        tipus=t;
        tipusLexema = t2;
        adreca=0;
    }

    public Registre(String l, String t, String t2, int a) {
        lexema=l;
        tipus=t;
        tipusLexema = t2;
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
    public String getTipusLexema() {return tipusLexema;}
    public Vector<Pair<String,String>> getCampsAddicionals() {return campsAddicionals;}

    public void putLexema(String l) {
        lexema=l;
    }
    public void putTipus(String t) {
        tipus=t;
    }
    public void putTipusLexema(String t) {
        tipusLexema=t;
    }
    public void putAdreca(int a) {
        adreca=a;
    }
    public void putCampsAddicionals(Vector<Pair<String,String>> camps){
        campsAddicionals = camps;
    }


}
