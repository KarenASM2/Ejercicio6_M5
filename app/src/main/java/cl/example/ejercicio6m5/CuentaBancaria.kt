package cl.example.ejercicio6m5

class CuentaBancaria(val nombreCuenta: String, var saldoDisponible: Double) {

    private val historialTransacciones = mutableListOf<String>()

    fun deposito(monto: Double) {
        if (monto > 0) {
            saldoDisponible += monto
            historialTransacciones.add("Depósito: $monto. ******** Saldo actual: $saldoDisponible")
        } else {
            println("Monto de depósito inválido.")
        }
    }

    fun retiro(monto: Double) {
        if (monto > 0 && monto <= saldoDisponible) {
            saldoDisponible -= monto
            historialTransacciones.add("Retiro: $monto. ******** Saldo actual: $saldoDisponible")
        } else if (monto > saldoDisponible) {
            historialTransacciones.add("Intento de retiro fallido de $monto. Saldo insuficiente.")
            println("Saldo insuficiente para realizar el retiro.")
        } else {
            println("Monto de retiro inválido.")
        }
    }

    fun mostrarSaldo() {
        println("")
        println("***********************************************")
        println("Saldo disponible de $nombreCuenta: $saldoDisponible")
    }

    fun mostrarHistorial() {
        println("\nHistorial de transacciones de $nombreCuenta:")
        println("----------------------------------------------")
        if (historialTransacciones.isEmpty()) {
            println("No hay transacciones registradas.")
        } else {
            historialTransacciones.forEach { println(it) }
        }
    }
}