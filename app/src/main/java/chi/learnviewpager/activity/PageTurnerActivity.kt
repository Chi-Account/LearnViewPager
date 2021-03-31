package chi.learnviewpager.activity

import android.os.Bundle
import chi.library.base.pageturner.BasePageTurnerActivity
import chi.library.base.pageturner.Page
import chi.library.util.LogUtil

class PageTurnerActivity : BasePageTurnerActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LogUtil.init(true)
    }

    override fun getPageList(): List<Page> =
        listOf(
            Page("水平方向", MainActivity::class.java),
            Page("竖直方向", MainActivity2::class.java),
            Page("TabLayout + ViewPager2 + Fragment", MainActivity3::class.java)
        )
}