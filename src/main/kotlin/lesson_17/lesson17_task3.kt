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
/*
Задача 3 к Уроку 17

В приложении для хранения облачных файлов есть папки и файлы. Создай класс папки, который имеет имя,
 количество файлов и флаг “секретно”. Если флаг имеет значение true, то при попытке прочитать имя, возвращать строку
 “скрытая папка” и количество файлов – 0. В ином случае возвращать ее название и реальное количество файлов.

Создай экземпляр “скрытой” папки. Протестируй попытку чтения ее данных. Используй геттеры. */