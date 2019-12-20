package jp.ykatabuc.todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.activity_main_fragment_wrapper, MainFragment()).commitNow()

        activity_main_add_fab.setOnClickListener {
            // TODO
        }
    }
}
