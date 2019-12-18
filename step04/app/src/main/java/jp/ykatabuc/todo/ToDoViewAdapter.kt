package jp.ykatabuc.todo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.cell_todo.view.*

class ToDoViewAdapter(private val context: Context) : RecyclerView.Adapter<ToDoViewHolder>() {

    private var todoList: List<ToDo> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewHolder =
        ToDoViewHolder(LayoutInflater.from(context).inflate(R.layout.cell_todo, parent, false))

    override fun getItemCount(): Int = todoList.size

    override fun onBindViewHolder(holder: ToDoViewHolder, position: Int) {
        val item = todoList[position]

        holder.titleTv.text = item.title
        holder.textTv.text = item.text
    }

    fun updateItems(newItems: List<ToDo>) {
        val diffResult = DiffUtil.calculateDiff(ToDoDiffUtilCallback(todoList, newItems), false)
        diffResult.dispatchUpdatesTo(this)
        todoList = newItems
    }
}

class ToDoDiffUtilCallback(
    private val old: List<ToDo>, private val new: List<ToDo>
) : DiffUtil.Callback() {
    override fun getOldListSize(): Int = old.size

    override fun getNewListSize(): Int = new.size

    override fun areItemsTheSame(oldItemPos: Int, newItemPos: Int) =
        old[oldItemPos] == new[newItemPos]

    override fun areContentsTheSame(oldItemPos: Int, newItemPos: Int) =
        old[oldItemPos] == new[newItemPos]

}

class ToDoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val titleTv: TextView = view.cell_todo_title
    val textTv: TextView = view.cell_todo_text
}