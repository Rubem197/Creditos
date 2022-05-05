public class Cliente {

    private int nCliente;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int saldo;
    private int ingreMedio;
    private int gastoMedio;
    private String Direccion;
    private int cPostal;

    public Cliente(int nCliente, String nombre, String apellido1, String apellido2, int saldo, int ingreMedio, int gastoMedio, String direccion, int cPostal) {
        this.nCliente = nCliente;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.saldo = saldo;
        this.ingreMedio = ingreMedio;
        this.gastoMedio = gastoMedio;
        Direccion = direccion;
        this.cPostal = cPostal;
    }
}
