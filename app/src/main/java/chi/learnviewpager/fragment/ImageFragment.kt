package chi.learnviewpager.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.DrawableRes
import androidx.fragment.app.Fragment
import chi.learnviewpager.R
import kotlinx.android.synthetic.main.fragment_image.*

private const val ARG_RESOURCE_ID = "ARG_RESOURCE_ID"

class ImageFragment : Fragment() {

    companion object {

        @JvmStatic
        fun newInstance(@DrawableRes resourceId: Int) =
            ImageFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_RESOURCE_ID, resourceId)
                }
            }
    }

    private var resourceId: Int = R.drawable.ereshkigal700

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            resourceId = it.getInt(ARG_RESOURCE_ID)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_image, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imageView.setImageResource(resourceId)
    }
}