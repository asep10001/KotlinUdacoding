fun main() {
    val kucing = Kucing()
    var umurAnggora = kucing.anggora("Putih", 12, 3.5)
    println(umurAnggora)
}

class Kucing{
    fun anggora(nama: String?= null, umur: Int?=null, beratBadan: Double?= null):Int?{
        return umur
    }
}