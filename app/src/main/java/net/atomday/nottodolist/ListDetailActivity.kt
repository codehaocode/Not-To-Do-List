package net.atomday.nottodolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ListDetailActivity : AppCompatActivity() {

    lateinit var list: TaskList


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_detail)

        list = intent.getParcelableExtra<TaskList>(MainActivity.INTENT_LIST_KEY) as TaskList

        title = list.name
    }
}