package jp.ykatabuc.todo

import androidx.lifecycle.*

class MainViewModel : ViewModel(), LifecycleObserver {

    private val getAllToDo: UseCase = GetToDo()
    private val mutableToDoList: MutableLiveData<List<ToDo>> = MutableLiveData()
    val todoList: LiveData<List<ToDo>> = mutableToDoList

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun loadAllToDo() {
        mutableToDoList.value = getAllToDo.getAllToDo()
    }
}