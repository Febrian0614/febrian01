

class Siswa(_firstName : String, _lastName : String){
    var firstName = _firstName
    var lastName = _lastName

    var name : String
        get() = firstName + " " + lastName

        set(value) {
            val fullName = value.split(" ")
            firstName = fullName[0]
        }

}

fun main() {
    val siswa = Siswa("Jalal","Udin")
    println(siswa.name)
    println("======== Nama Diganti ========")
    siswa.name = "Carl suzume"
    println(siswa.name)

}