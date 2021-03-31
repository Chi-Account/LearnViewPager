package chi.learnviewpager.adapter

import android.widget.ImageView
import chi.learnviewpager.R
import chi.learnviewpager.bean.ImageWrapper
import chi.library.view.recyclerview.ViewHolder

class RecyclerViewAdapter(
    dataList: List<ImageWrapper>
) : chi.library.view.recyclerview.adapter.RecyclerViewAdapter<ImageWrapper>(
    dataList
) {

    override fun getLayoutResource(itemViewType: Int): Int = R.layout.adapter_recycler_view

    override fun onBindViewHolder(holder: ViewHolder, position: Int, item: ImageWrapper) {
        holder.getView<ImageView>(R.id.imageView).setImageResource(item.resourceId)
    }
}