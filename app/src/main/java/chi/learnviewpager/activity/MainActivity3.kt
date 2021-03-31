package chi.learnviewpager.activity

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import chi.learnviewpager.R
import chi.learnviewpager.adapter.ImageFragmentStateAdapter
import chi.learnviewpager.bean.ImageWrapper
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.viewPager2
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity3 : AppCompatActivity() {

    private val dataList = getDataList()

    private val adapter = ImageFragmentStateAdapter(this, dataList)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        viewPager2.adapter = adapter
        tabLayout.tabMode = TabLayout.MODE_SCROLLABLE
        TabLayoutMediator(
            tabLayout,
            viewPager2
        ) { tab, position ->
            tab.text = adapter.getItem(position).text
        }.attach()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main3, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean =
        when (item.itemId) {
            R.id.item_add -> {
                add()
                true
            }
            R.id.item_remove -> {
                remove()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }

    private fun add() {
        val index = dataList.size
        val item = ImageWrapper(R.drawable.ereshkigal700, "700")
        dataList.add(index, item)
        adapter.notifyItemInserted(index)
        viewPager2.setCurrentItem(index, true)
    }

    private fun remove() {
        if (dataList.isNotEmpty()) {
            val index = dataList.size - 1
            dataList.removeAt(index)
            adapter.notifyItemRemoved(index)
        }
    }

    private fun getDataList(): MutableList<ImageWrapper> =
        mutableListOf(
            ImageWrapper(R.drawable.ereshkigal700, "700"),
            ImageWrapper(R.drawable.ereshkigal829, "829"),
            ImageWrapper(R.drawable.ereshkigal1048, "1048"),
            ImageWrapper(R.drawable.ereshkigal1229, "1229"),
            ImageWrapper(R.drawable.romani076, "076"),
            ImageWrapper(R.drawable.romani179, "179"),
            ImageWrapper(R.drawable.romani280, "280"),
            ImageWrapper(R.drawable.romani346, "346"),
            ImageWrapper(R.drawable.romani590, "590"),
            ImageWrapper(R.drawable.romani893, "893")
        )
}