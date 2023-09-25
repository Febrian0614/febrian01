open class Animal(val namaHewan : String ) {
    var kaki: Int = 0
    var jenis: String = " "
    var habitat: String = " "

    fun makan() {
        println("Hewan sedang makan")
    }

    fun jalan() {
        println("Hewan ini sedang berjalan")
    }
}
    class Beruang(namaHewan: String) : Animal(namaHewan)

    fun main(){
        val animal = Animal("sembarang")

        var Beruang = Beruang("beruang madu")
        Beruang.kaki = 4
        Beruang.jenis = "Mamalia"
        Beruang.habitat = "Hutan"
        println(Beruang.kaki)
        println(Beruang.jenis)
        println(Beruang.habitat)


}