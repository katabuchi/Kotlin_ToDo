package jp.ykatabuc.todo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    private val onClickItem: (ToDo) -> Unit = {}
    private val adapter: ToDoViewAdapter by lazy {
        ToDoViewAdapter(requireContext(), onClickItem)
    }
    private val viewModel: MainViewModel by lazy {
        ViewModelProvider(this).get(MainViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lifecycle.addObserver(viewModel)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fragment_todo_rv.adapter = adapter
        fragment_todo_rv.addItemDecoration(
            DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL))

        viewModel.todoList.observe(viewLifecycleOwner, Observer {
            adapter.updateItems(it)
        })
    }
}