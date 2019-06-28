package sulaiman.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import sulaiman.coderswag.Adapters.CategoryAdapter
import sulaiman.coderswag.Model.Category
import sulaiman.coderswag.R
import sulaiman.coderswag.Services.DataService

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)

        listView.adapter = adapter
    }
}
