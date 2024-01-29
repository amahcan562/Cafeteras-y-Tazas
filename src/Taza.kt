class Taza(val color: Color = Color.BLANCO, val capacidad: Int = 50) {

    var cantidad = 0
        set(value) {
            field = if (value > this.capacidad) this.capacidad else value
        }

    fun llenar (){
        this.cantidad = this.capacidad
    }

    fun llenar(cantidad: Int) {
        this.cantidad = cantidad
    }

    override fun toString(): String {
        return ("Taza (color = ${this.color}, capacidad = ${this.capacidad}c.c., cantidad = ${this.cantidad}c.c.)")
    }

}