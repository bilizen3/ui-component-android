package com.flores.uicomponentandroid

import android.os.Bundle
import android.view.Gravity
import android.view.animation.AnimationUtils
import android.widget.TextView
import android.widget.ViewSwitcher
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_text_switcher.*


/**
 * TextSwitcherActivity
 *
 * @author Bill Flores - bilizen3@gmail.com
 * @since 03/10/2020
 */
class TextSwitcherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_switcher)
        initUi()
    }

    private fun initUi() {
        textSwitcher_ts.setFactory(ViewSwitcher.ViewFactory {
            val textView = TextView(this);
            textView.gravity = Gravity.TOP or Gravity.CENTER_HORIZONTAL
            return@ViewFactory textView
        })

        textSwitcher_ts.inAnimation =
            AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left)
        textSwitcher_ts.outAnimation = AnimationUtils.loadAnimation(
            this, android.R.anim
                .slide_out_right
        )
        textSwitcher_ts.setCurrentText("Buenos dias");
        textSwitcher_btn_start.setOnClickListener {
            textSwitcher_ts.setCurrentText("Buenas noches")
        }
    }


}