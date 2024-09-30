package cl.example.ejercicio6m5

fun main() {

    val cuenta1 = CuentaBancaria("Sebastián Torres", 1500.0)
    val cuenta2 = CuentaBancaria("Roberto Rojas", 2000.0)
    val cuenta3 = CuentaBancaria("Claudia Flores", 500.0)

    cuenta1.deposito(200.0)
    cuenta1.retiro(300.0)
    cuenta1.retiro(1500.0)
    cuenta1.deposito(700.0)
    cuenta1.retiro(100.0)

    cuenta2.deposito(500.0)
    cuenta2.retiro(100.0)
    cuenta2.deposito(300.0)
    cuenta2.retiro(700.0)
    cuenta2.deposito(1000.0)

    cuenta3.retiro(200.0)
    cuenta3.deposito(100.0)
    cuenta3.retiro(50.0)
    cuenta3.retiro(400.0)
    cuenta3.deposito(150.0)

    cuenta1.mostrarHistorial()
    cuenta2.mostrarHistorial()
    cuenta3.mostrarHistorial()

    cuenta1.mostrarSaldo()
    cuenta2.mostrarSaldo()
    cuenta3.mostrarSaldo()
}