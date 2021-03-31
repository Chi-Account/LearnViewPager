package chi.learnviewpager.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import chi.learnviewpager.bean.ImageWrapper
import chi.learnviewpager.fragment.ImageFragment

class ImageFragmentStateAdapter(
    fragmentActivity: FragmentActivity,
    private val dataList: MutableList<ImageWrapper>
) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int = dataList.size

    override fun createFragment(position: Int): Fragment =
        ImageFragment.newInstance(getItem(position).resourceId)

    fun getItem(position: Int) = dataList[position]
}