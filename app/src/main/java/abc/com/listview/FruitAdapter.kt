package abc.com.listview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item_fruit.view.*

class FruitAdapter (
    val  fruits :ArrayList<Fruit>
) : RecyclerView.Adapter<FruitAdapter.FruitViewHolder>(){
    class FruitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
     val  itemView=  LayoutInflater.from(parent.context).inflate(
        R.layout.list_item_fruit, parent, false
    )
return FruitViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
holder.itemView.tvFruitName.text= fruits[position].name
        holder.itemView.tvOrigin.text= fruits[position].origin

        holder.itemView.tvQuantity.text= fruits[position].quality.toString()


    }

    override fun getItemCount(): Int=fruits.size

}