package mx.edu.potros.mydigimind_215109.ui

import java.io.Serializable

class Carrito: Serializable {
    var recordatorios = ArrayList<Recordatorio>()

    fun agregar(p: Recordatorio): Boolean {
        return recordatorios.add(p)
    }
}