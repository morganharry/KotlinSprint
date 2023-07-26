package lesson_14

open class Post(
    val textPost: String,
    val author: String
) {
    fun showPost() {
        println("Автор $author пишет:\n$textPost")
    }
}

class Comment(
    textPost: String,
    author: String,
    val post: Post,
) : Post(textPost, author) {
    fun showComment() {
        println("Автор $author оставил комментарий к посту ${post.author}:\n$textPost ")
    }
}

fun main() {
    val text1 =
        "Катушка является одной из ключевых компонентов спиннинговой снасти и играет важную роль в успешной рыбалке." +
                "Однако выбор правильной катушки может быть непростым заданием из-за разнообразия моделей и характеристик, " +
                "предлагаемых на рынке."

    val post1 = Post(text1, "Rybachok")
    post1.showPost()

    val text2 =
        "По сути всё зависит от бюджета, если позволяет, то выбрать сразу из лидеров рынка Daiwa или Шимано, " +
                "а там зависит от хотелок, чем выше класс, тем дороже и качественней, ну и комфортней, " +
                "там уже материалы, количество подшипников, технологий растёт с ценой вместе."

    val comment1 = Comment(text2, "Viper", post1)
    comment1.showComment()
}