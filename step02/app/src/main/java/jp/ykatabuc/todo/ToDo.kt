package jp.ykatabuc.todo

interface ToDoRepository {
    // TODO: Coroutineで記述
    fun getAllToDo(): List<ToDo>
    fun deleteToDo(id: Int)
    fun editToDo(id: Int, todo: ToDo)
}

/**
 * ToDoDomainクラス
 */
data class ToDo(
    private val id: Int,
    val title: String,
    val text: String)

interface UseCase {
    fun getAllToDo(): List<ToDo>
}

class GetToDo : UseCase {
    override fun getAllToDo(): List<ToDo> = listOf()
}