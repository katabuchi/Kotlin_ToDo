package jp.ykatabuc.todo

class ToDoRepositoryImpl : ToDoRepository {
    override fun getAllToDo(): List<ToDo> {
        return listOf(ToDo(0, "SampleTitle", "SampleText"))
    }

    override fun deleteToDo(id: Int) {

    }

    override fun editToDo(id: Int, todo: ToDo) {

    }
}