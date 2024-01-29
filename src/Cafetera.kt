class Cafetera (val ubicacion: String){


    var capacidad : Int = 1000
    var cantidad : Int = 0

    constructor(ubicacion: String, capacidad: Int) : this(ubicacion) {
        this.cantidad = cantidad
        this.capacidad = capacidad
    }

    constructor(ubicacion: String, capacidad: Int, cantidad: Int ) : this(ubicacion) {
        this.capacidad = capacidad
        this.cantidad = if (cantidad > capacidad) capacidad else cantidad
    }

    fun llenar() {
        this.cantidad = this.capacidad
    }

    fun servirCafe(cantidad: Int) {
        this.cantidad -= cantidad
    }

    fun servirTaza(taza: Taza) {
        if (this.cantidad > 0) {
            taza.llenar()
            servirCafe(taza.capacidad)
        } else {
            taza.llenar(this.cantidad)
            vaciar()
        }

    }

    fun vaciar() {
        cantidad = 0
    }

    fun agregarCafe(cantidad: Int = 200) {
       if (this.cantidad + cantidad > this.capacidad) {
           llenar()
       } else
           this.cantidad += cantidad
    }

    override fun toString(): String {
        return  "Cafetera (ubicación = ${this.ubicacion}, capacidad = ${this.capacidad}c.c., cantidad = ${this.cantidad}c.c.)")
    }
}
