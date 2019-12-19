package jp.ykatabuc.todo

class ToDoRepositoryImpl : ToDoRepository {
    override fun getAllToDo(): List<ToDo> = createMockData()

    override fun deleteToDo(id: Int) {
        // TODO
    }

    override fun editToDo(id: Int, todo: ToDo) {
        // TODO
    }

    private fun createMockData(): List<ToDo> = listOf(
        ToDo(1, "ToDo Title 01", "ToDo Text 01"),
        ToDo(2, "ToDo Title 02", "ToDo Text 02"),
        ToDo(3, "ToDo Title 03", "ToDo Text 03"),
        ToDo(4, "ToDo Title 04", "ToDo Text 04"),
        ToDo(5, "ToDo Title 05", "ToDo Text 05"),
        ToDo(6, "ToDo Title 06", "ToDo Text 06"),
        ToDo(7, "ToDo Title 07", "ToDo Text 07"),
        ToDo(8, "ToDo Title 08", "ToDo Text 08"),
        ToDo(9, "ToDo Title 09", "ToDo Text 09"),
        ToDo(10, "ToDo Title 10", "ToDo Text 10")
    )
}