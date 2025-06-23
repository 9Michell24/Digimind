package mx.edu.potros.digimind_215109

import java.io.Serializable

class Carrito : Serializable{
    var recordatorios= ArrayList<Recordatorio>()

    fun agregar(p:Recordatorio):Boolean{
        return recordatorios.add(p)
    }
}

