grammar gram;

//Regla sintactica: qualsevol token diferent de EOF
inici: (~EOF)+;

//Reg;es ;lexiques

fragment DIGIT: '1'..'9';
fragment LETER: 'a'..'z';
fragment CAPLETER: 'A'..'Z'