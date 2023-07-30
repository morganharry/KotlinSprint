package lesson_17

class Directory(_name: String, _numOfFiles: Int, _isSecret: Boolean) {
    var name: String = _name
        get() = if (isSecret == true) "скрытая папка" else field
    var numOfFiles: Int = _numOfFiles
        get() = if (isSecret == true) 0 else field
    var isSecret: Boolean = _isSecret

    fun getInfo() {
        println("Папка \"$name\" содержит $numOfFiles файлов.")
    }
}

fun main() {
    val directory1 = Directory("презентации", 5, false)
    val directory2 = Directory("отчёты", 10, true)

    directory1.getInfo()
    directory2.getInfo()
}