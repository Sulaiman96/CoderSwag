package sulaiman.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import sulaiman.coderswag.Model.Category
import sulaiman.coderswag.R

class CategoryAdapter(context : Context, categories : List<Category>) : BaseAdapter() {

    val context = context
    val categories = categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val holder : ViewHolder = ViewHolder()
        val categoryView: View = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)

        if(convertView == null) {
            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            holder.categoryName = categoryView.findViewById(R.id.categoryName)
        }

        val category = categories[position]
        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.categoryImage?.setImageResource(resourceId)
        holder.categoryName?.text = category.title

        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

    private class ViewHolder(){
        var categoryImage : ImageView? = null
        var categoryName : TextView? = null
    }
}