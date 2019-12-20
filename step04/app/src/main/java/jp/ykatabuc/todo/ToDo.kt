package jp.ykatabuc.todo

interface ToDoRepository {
    // TODO: Coroutineで記述
    fun getAllToDo(): List<ToDo>
    fun deleteToDo(id: Int)
    fun editToDo(id: Int, todo: ToDo)
}

data class ToDo(
    val id: Int,
    val title: String,
    val text: String,
    var isCheck: Boolean = false)

interface UseCase {
    fun getAllToDo(): List<ToDo>
}

class GetToDo(
    private val repository: ToDoRepository = ToDoRepositoryImpl()
) : UseCase {
    override fun getAllToDo(): List<ToDo> = repository.getAllToDo()
}