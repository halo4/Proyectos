public class Nombre_Completo{
/** Cree el metodo "name" para la primera parte del nombre declarandolo como cadena y usando salto de lineas */
        public String name(){
        	String name1 =  "  DDDDDDD          AAA       NNN      NN IIIIIIII  EEEEEEEEE  LL       "+"\n"+
                                "   DD    DD       AA AA      NNNN     NN    II     EE      E  LL       "+"\n"+
                                "   DD     DD     AA   AA     NN  NN   NN    II	   EE         LL       "+"\n"+
		  	        "   DD      D    AA     AA    NN   NN  NN    II	   EEEEEE     LL       "+"\n"+ 		                        "   DD     DD   AAAAAAAAAAA   NN    NN NN    II     EE         LL       "+"\n"+
		  	        "   DD    DD   AA         AA  NN     NNNN    II     EE      E  LL       "+"\n"+
		                "  DDDDDDD    AA           AA NN      NNN IIIIIIII  EEEEEEEEE  LLLLLLLLL"+"\n"+
				"";
				
		return name1;

	}
/** Lo mismo se hizo para el apellido paterno declaracion como cadena y cada linea es una cadena se hace una concatenacion para agregar un salto de linea y "unir" la siguiente linea*/
	public String apellidoPat(){
	  String apellido =       "    GGGGGGG        AAA       RRRRRRR       CCCCCCCC  IIIIIIIIII       AAA      "+"\n"+
                                  "   GG             AA AA      RR    RR     CC             II          AA AA     "+"\n"+
                                  "  GG             AA   AA     RR    RR    CC              II         AA   AA    "+"\n"+
                                  "  GG  GGGGGG    AA     AA    RRRRRRR     CC              II        AA     AA   "+"\n"+
                                  "  GG       G   AAAAAAAAAAA   RR   RR     CC              II       AAAAAAAAAAA  "+"\n"+
                                  "   GG      G  AA         AA  RR    RR     CC             II      AA         AA "+"\n"+
                                  "     GGGGGG  AA           AA RR     RRR    CCCCCCCC  IIIIIIIIII AA           AA"+"\n"+
				  "";
		return apellido;     
       }
	public String apellidoMat(){            
	    String apellido =     "LL              UU      UU  NNN     NN        AAA      "+"\n"+
				  "LL              UU	UU  NNNN    NN 	     AA AA     "+"\n"+
				  "LL		UU	UU  NN NN   NN	    AA   AA    "+"\n"+
				  "LL	        UU	UU  NN  NN  NN     AA     AA   "+"\n"+
				  "LL		UU	UU  NN   NN NN    AAAAAAAAAAA  "+"\n"+
				  "LL		 UU    UU   NN    NNNN   AA         AA "+"\n"+
				  "LLLLLLLLLLL	  UUUUUU    NN     NNN  AA           AA"+"\n"+
				  "";
                                  
		return apellido;
       }                            
/** Cree el metodo main para invocar a los tres diferentes metodos en los tres diferentes ordenes */		
	public static void main (String args []){
		Nombre_Completo nom = new Nombre_Completo ();
		System.out.println(nom.apellidoPat()+nom.apellidoMat()+nom.name());
		System.out.println(nom.name()+nom.apellidoPat()+nom.apellidoMat());
		System.out.println(nom.apellidoMat()+nom.apellidoPat()+nom.name());
	}
	
}
