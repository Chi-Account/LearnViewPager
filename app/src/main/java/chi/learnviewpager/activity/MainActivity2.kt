package chi.learnviewpager.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import chi.learnviewpager.R
import chi.learnviewpager.adapter.RecyclerViewAdapter
import chi.learnviewpager.bean.ImageWrapper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        viewPager2.orientation = ViewPager2.ORIENTATION_VERTICAL
        viewPager2.adapter = RecyclerViewAdapter(getDataList())
    }

    private fun getDataList(): List<ImageWrapper> =
        listOf(
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