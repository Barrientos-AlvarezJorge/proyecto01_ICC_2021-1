/**
 *Proyecto 1 ICC
 *@auhor Jorge Miguel Aaron Barrientos Alvarez. NC:421111666
 *@since Curso de ICC 2021-1
 *@version 1.0 noviembre 2020
 */

public class NumeroTresCifras implements ServiciosNumeroTresCifras{

    /**Unidades del número de tres cifras*/
    public int unidades;

    /**Decenas del número de tres cifras*/
    public int decenas;

    /**Centenas del número de tres cifras*/

    public int centenas;

 
    //Método constructor 1
    /**
     *Crea un número de tres cifras
     *@param unidades del número
     *@param decenas del número
     *@param centenas del número
     */

    public NumeroTresCifras(int centenas, int decenas, int unidades){
	this.unidades=unidades;
	this.decenas=decenas;
	this.centenas=centenas;
    }
       
    //Método constructor 2
    /**Crea un número de tres cifras
     *No recibe parámetros
     */

    public NumeroTresCifras(){
	this.unidades=0;
	this.decenas=0;
	this.centenas=0;	
    }
    
    
    //Métodos de acceso
    /**
     *Regresa el valor de las unidades del número
     *@return unidades
     */
    public int getUnidades(){
	return unidades;
    }

    /**
     *Regresa el valor de las decenas del número
     *@return decenas
     */
    public int getDecenas(){
	return decenas;
    }

    /**
     *Regresa el valor de las centenas del número
     *@return centenas
     */
    public int getCentenas(){
	return centenas;
    }

  
    //Métodos mutantes

    /**
     *Modifica el valor de la unidades del número
     *@param unidades
     */

    public void setUnidades(int nuevasUnidades){
	this.unidades=nuevasUnidades;
    }

    /**
     *Modifica el valor de la decenas del número
     *@param decenas
     */

    public void setDecenas(int nuevasDecenas){
	this.decenas=nuevasDecenas;
    }

    /**
     *Modifica el valor de la centenas del número
     *@param centenas
     */

    public void setCentenas(int nuevasCentenas){
	this.centenas=nuevasCentenas;	
    }

    /**Creacion de los números de tres cifras con los que se
     *va a trabajar en esta clase
     */

    /**Numero de tres cifras al que se le van a aplicar los métodos */
    public static NumeroTresCifras pruebas=new NumeroTresCifras(1,2,3);
    
    /**Numero de tres cifras que guarda el resultado del método suma */
    public static NumeroTresCifras resultadoSuma=new NumeroTresCifras();

    /**Numero de tres cifras que guarda el resultado del método multiplica  */
    public static NumeroTresCifras resultadoMultiplica=new NumeroTresCifras();

    /**Numero de tres cifras que guarda el resultado del metodo multiplica10 */
    public static NumeroTresCifras resultadoPorDiez = new NumeroTresCifras();

    /**Numero de tres cifras que guarda el resultado del método multiplica100 */
    public static NumeroTresCifras resultadoPorCien =new NumeroTresCifras();

    /**Numero de tres cifras que guarda el resultado del método divide10 */
    public static NumeroTresCifras resultadoEntreDiez=new NumeroTresCifras();

    /**Numero de tres cifras que guarda el resultado del método divide100 */
    public static NumeroTresCifras resultadoEntreCien=new NumeroTresCifras();

    /**Numero de tres cifras que guarda el resultado del método complemento */
    public static NumeroTresCifras complemento = new NumeroTresCifras();

    /**Numero de tres cifras que guarda el resultado del método capicua */
    public static NumeroTresCifras capicua = new NumeroTresCifras();

    
    //Métodos de la clase
    @Override
    public NumeroTresCifras suma (NumeroTresCifras otro){
	int u_pruebas, d_pruebas, c_pruebas, u_otro, d_otro, c_otro;
	
	/*Estas variables "llevaX" nos ayudan a resolver las sumas y las 
	 *multiplicaciones en los casos en los que los valores de las 
	 *unidades y las decenas sean mayores o iguales a 10.
	 *Por ejemplo, si sumamos 88+33, primero hacemos 8+3, "ponemos" el 1
	 * y "llevamos" 1. Luego, hacemos 1+8+3, y el resultado de la suma es 121.
	 */
        int llevamosU=0, llevamosD=0; 
	
	u_pruebas=pruebas.getUnidades();
	d_pruebas=pruebas.getDecenas();
	c_pruebas=pruebas.getCentenas();
	
	u_otro=otro.getUnidades();
	d_otro=otro.getDecenas();
	c_otro=otro.getCentenas();
	
	int u_resultadoSuma=u_pruebas+u_otro;
	if(u_resultadoSuma>=10){
	    llevamosU=u_resultadoSuma/10;         //"llevamos"
	    u_resultadoSuma=u_resultadoSuma%10;  //"ponemos" 
	}
	

	int d_resultadoSuma=d_pruebas+d_otro+llevamosU;
	if(d_resultadoSuma>=10){
	    llevamosD=d_resultadoSuma/10;         //"llevamos
	    d_resultadoSuma=d_resultadoSuma%10;  //"ponemos"
	}

	int c_resultadoSuma=c_pruebas+c_otro+llevamosD;
	if(c_resultadoSuma>=10)
	    c_resultadoSuma=c_resultadoSuma%10; /*"ponemos" se "hace" igualmete en este caso
						  porque tenemos que restringir los númeres a
						  tener nadamás tres cifras */
	
	resultadoSuma.setUnidades(u_resultadoSuma);
	resultadoSuma.setDecenas(d_resultadoSuma);
	resultadoSuma.setCentenas(c_resultadoSuma);
      	return resultadoSuma;
    }

    @Override
    public NumeroTresCifras multiplica(int n){
	int u_pruebas, d_pruebas, c_pruebas;

	/*Estas variables "llevaX" nos ayudan a resolver las sumas y las 
	 *multiplicaciones en los casos en los que los valores de las 
	 *unidades y las decenas sean mayores o iguales a 10.
	 *Por ejemplo, si multiplicamos 88x3, primero hacemos 8x3, "ponemos" el 4
	 * y "llevamos" 2. Luego, hacemos 8*3+2, y el resultado de la multiplicación es 264.
	 */
	int llevamosU=0, llevamosD=0;
	
	u_pruebas=pruebas.getUnidades();
	d_pruebas=pruebas.getDecenas();
	c_pruebas=pruebas.getCentenas();

	int u_resultadoMultiplica=u_pruebas*n;
	if(u_resultadoMultiplica>=10){
	    llevamosU=u_resultadoMultiplica/10;                //"llevamos"
	    u_resultadoMultiplica=u_resultadoMultiplica%10;   //"ponemos""
	}

	int d_resultadoMultiplica=(d_pruebas*n)+llevamosU;
	if(d_resultadoMultiplica>=10){
	    llevamosD=d_resultadoMultiplica/10;               //"llevamos"
	    d_resultadoMultiplica=d_resultadoMultiplica%10;  //"ponemos"
	}

	int c_resultadoMultiplica=(c_pruebas*n)+llevamosD;
	if(c_resultadoMultiplica>=10)
	    c_resultadoMultiplica=c_resultadoMultiplica%10; /*"ponemos" se "hace" igualmente en este caso
							      porque debemos restringir los números a tener
							      nadamás tres cifras*/
	
	resultadoMultiplica.setUnidades(u_resultadoMultiplica);
	resultadoMultiplica.setDecenas(d_resultadoMultiplica);	
	resultadoMultiplica.setCentenas(c_resultadoMultiplica);

	return resultadoMultiplica;
    }

    @Override
    public NumeroTresCifras multiplica10(){ 
	resultadoPorDiez.setUnidades(0);
	resultadoPorDiez.setDecenas(pruebas.getUnidades());
	resultadoPorDiez.setCentenas(pruebas.getDecenas());
	
	return resultadoPorDiez;
    }

    @Override
    public NumeroTresCifras multiplica100(){	
	resultadoPorCien.setUnidades(0);
	resultadoPorCien.setDecenas(0);
	resultadoPorCien.setCentenas(pruebas.getUnidades());
	
	return resultadoPorCien;
    }

    @Override
    public NumeroTresCifras divide10(){
	resultadoEntreDiez.setUnidades(pruebas.getDecenas());
	resultadoEntreDiez.setDecenas(pruebas.getCentenas());
	resultadoEntreDiez.setCentenas(0);

	return resultadoEntreDiez;    
    }

    @Override
    public NumeroTresCifras divide100(){
	resultadoEntreCien.setUnidades(pruebas.getCentenas());
	resultadoEntreCien.setDecenas(0);
	resultadoEntreCien.setCentenas(0);

	return resultadoEntreCien;
    }

    @Override
    public NumeroTresCifras complemento(){
	complemento.setUnidades(9-pruebas.getUnidades());
	complemento.setDecenas(9-pruebas.getDecenas());
	complemento.setCentenas(9-pruebas.getCentenas());

	return complemento;
    }

    @Override
    public NumeroTresCifras capicua(){
	capicua.setUnidades(pruebas.getCentenas());
	capicua.setDecenas(pruebas.getDecenas());
	capicua.setCentenas(pruebas.getUnidades());

	return capicua;
    }

    @Override
    public boolean esMayor(NumeroTresCifras otro){
	int u_pruebas, d_pruebas, c_pruebas, u_otro, d_otro, c_otro;
	boolean respuesta;
	
	u_pruebas=pruebas.getUnidades();
	d_pruebas=pruebas.getDecenas();
	c_pruebas=pruebas.getCentenas();

	u_otro=otro.getUnidades();
	d_otro=otro.getDecenas();
	c_otro=otro.getCentenas();

	return c_pruebas>c_otro || (c_pruebas==c_otro && d_pruebas
				    > d_otro) || (c_pruebas==c_otro
						  && d_pruebas
						  == d_otro &&
						  u_pruebas>u_otro); 
    }

    @Override
    public boolean esIgual(NumeroTresCifras otro){
	int u_pruebas, d_pruebas, c_pruebas, u_otro, d_otro, c_otro;
	
	u_pruebas=pruebas.getUnidades();
	d_pruebas=pruebas.getDecenas();
	c_pruebas=pruebas.getCentenas();

	u_otro=otro.getUnidades();
	d_otro=otro.getDecenas();
	c_otro=otro.getCentenas();

	return c_pruebas==c_otro && d_pruebas==d_otro && u_pruebas
	    ==u_otro;
    }

    @Override
    public String muestra(){
        String muestra=""+this.centenas+""+this.decenas+""+this.unidades;
	return muestra;
    }
    
    public static void main(String[] args){
	/*Numero de tres cifras con el que se le aplicaran los métodos
	 *al número de tres cifras "pruebas"
	 *por ejemplo, en el método suma, el resultado será el de la suma
	 *de pruebas con metodos.
	 */
	NumeroTresCifras metodos=new NumeroTresCifras(4,5,6);

	/*Numero entero por el cual se va a multiplicar el número
	  de tres cifras prueba en el método multiplica */
	int n=4;
	
	//Implementación y muestra del método suma
	pruebas.suma(metodos);
	System.out.println("\nLa suma del numero "+pruebas.muestra()+" y el numero "
			   +metodos.muestra()+" da como resultado el numero "
			   +resultadoSuma.muestra());

	//Implementación y muestra del método multiplica
	pruebas.multiplica(n);
	System.out.println("\nEl producto de "+pruebas.muestra()+" y el numero "+n+" da como resultado el numero "
			   +resultadoMultiplica.muestra());

	//Implementación y muestra del método multiplica10
	pruebas.multiplica10();
	System.out.println("\nEl producto de "+pruebas.muestra()+" y el numero 10 da como resultado el numero "
			   +resultadoPorDiez.muestra());

	//Implementación y muestra del método multiplica100
	pruebas.multiplica100();
	System.out.println("\nEl producto de "+pruebas.muestra()+" y el numero 100 da como resultado el numero "
			   +resultadoPorCien.muestra());

	//Implementación y muestra del método divide10
	pruebas.divide10();
	System.out.println("\nLa division del numero "+pruebas.muestra()+" y el numero 10 da como resultado el numero "
			   +resultadoEntreDiez.muestra());

	//Implementación y muestra del método divide100
	pruebas.divide100();
	System.out.println("\nLa division del numero "+pruebas.muestra()+" y el numero 100 da como resultado el numero "
			   +resultadoEntreCien.muestra());

	//Implementación y muestra del método complemento
	pruebas.complemento();
	System.out.println("\nEl numero  "+pruebas.muestra()+" mas el numero  "+complemento.muestra()
			   +" da como resultado 999");

	//Implementación y muestra del método capicua
	pruebas.capicua();
	System.out.println("\nEl numero "+pruebas.muestra()+" con sus dígitos invertidos es el numero "
			   +capicua.muestra());

	//Implementación y muestra del método esMayor
	System.out.println("\nEl numero "+pruebas.muestra()+" es mayor al número "+metodos.muestra()+"? "
			   +pruebas.esMayor(metodos));

	//Implementación y muestra del método esIgual
	System.out.println("\nEl numero "+pruebas.muestra()+" es igual al número "+metodos.muestra()+"? "
			   +pruebas.esIgual(metodos));			   	
    }	
}
