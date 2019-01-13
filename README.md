# Compiladors-ANTLR4

##Sintàctic

### Done 
* main
    * varBlock
* typeBlock
* funcDecBlock
* constBlock
* varBlock
* basicType
* vector
* tupla

### TODO

* main
    * sentences
* funcImpBlock
* type
* comments 


## Lèxic
### REPASSAR
* operadors
* separadors

### Done
* paraules claus
* constants
* operadors
  * suma
  * resta
  * multiplicacio
  * divisio real (/)
  * divisio entera(\)
  * modul (%)
  * igualtat logica
  * diferencia logica
  * <
  * \>
  * <= 
  * \>=
  * negacio logica (no)
  * and (&)
  * or (|)
  * if-then-else (condicio ? exptrue : expfalse)
  * vectors ([])
  * acces a tuples (.)
  * assignacio (:=)
* comentaris
* separadors
* identificadors



## Semàntic

### Tipus de registres de la taula de símbols

Per cada tipus, hi ha un conjunt de informació que s'ha de guardar, apart del nom del registre

* constant
    * res
* variable
    * res
* alias
    * tipus real
* tupla
    * llista amb els camps de la tupla (nom i tipus)
* vector
    * mida
    * inici (si no s'ha definit, 0)
* funció/acció
    * return (void en cas de acció)
    * llista amb els tipus dels paràmetres

Per fer-ho s'utilitzaran classes heretant d'una abstracte, per poder usar aquesta informació.