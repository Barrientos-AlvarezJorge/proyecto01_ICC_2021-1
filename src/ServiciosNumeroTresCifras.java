/**
* Los servicios que debe ofrecer un número de 3 cifras
* de la forma CDU , donde C son las centenas , D las
* decenas y U las unidades .
*/

public interface ServiciosNumeroTresCifras{
    /**
     * Suma dos números de tres cifras y entrega el resultado .
     *
     * @param otro El segundo número de tres cifras (El primero es el
     * objeto con que se invoca ).
     * @return El resultado de la suma . Ej:
     *
     * 123 + 456 = 579
     */

    public NumeroTresCifras suma(NumeroTresCifras otro);

    /**
     * Multiplica el número por algún escalar menor a 10.
     *
     * @param n Un escalar que cumple con 0 ≤ n < 10.
     *
     * @return El resultado de la multiplicaci  ́on. Ej:
     *
     * 123 ∗ 3 = 369
     */

    public NumeroTresCifras multiplica(int n);

    /**
     * Multiplica el número por 10.
     *
     * @return Un número que desplaza las cifras a la izquierda
     * y agrega un 0 a la derecha . Ej:
     *
     * 123 ∗ 10 = 230
     */
    public NumeroTresCifras multiplica10();

    /**
     * Multiplica el número por 100.
     *
     * @return El resultado de multiplicar un número dos veces por 10:
     *
     * CDU ∗ 100 = CDU ∗ 10 ∗ 10
     */
    public NumeroTresCifras multiplica100();

    /**
     * Divide el número entre 10.
     *
     * @return Un número que desplaza las cifras a la derecha
     * y agrega un 0 a la izquierda . Ej:
     *
     * 123/10 = 012
     */

    public NumeroTresCifras divide10();

    /**
     * Divide el número entre 100.
     *
     * @return El resultado de dividir un número dos veces entre 10:
     *
     * CDU/100 = (CDU/10)/10
     */
    public NumeroTresCifras divide100();

    /**
     * Devuelve el número de tres cifras necesario para sumar 999.
     *
     * @return El número de tres cifras que corresponde a:
     *
     * (9 − C)(9 − D)(9 − U)
     */
    public NumeroTresCifras complemento();

    /**
     * Devuelve el un número con el orden de los dígitos
     * invertido .
     *
     * @return El número de tres cifras que corresponde a: UDC
     *
     */
    public NumeroTresCifras capicua();
    
    /**
     * Compara dos números para saber si quien invoca es mayor .
     *
     * @param otro El segundo número (El primero es el
     * objeto con que se invoca ).
     * @return true si quien invoca es mayor , false en otro caso .
     *
     * C1 > C2 o (C1 = C2 y D1 > D2) o (C1 = C2, D1 = D2 y U1 > U2)
     * ⇒ C1D1U1 > C2D2U2
     */
     public boolean esMayor(NumeroTresCifras otro);

    /**
     * Compara dos números para saber si son iguales .
     *
     * @param otro El segundo número (El primero es el
     * objeto con que se invoca ).
     * @return true si son iguales , false en otro caso .
     *
     * C1 = C2, D1 = D2 y U1 = U2 ⇒ C1D1U1 = C2D2U2
     */
    public boolean esIgual(NumeroTresCifras otro);
    
    /**
     * Devuelve una cadena que corresponde con el número
     * de tres cifras .
     *
     * @return La cadena correspondiente a CDU .
     */
     public String muestra();
    
}
