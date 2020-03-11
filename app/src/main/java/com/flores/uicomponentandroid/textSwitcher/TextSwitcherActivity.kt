package com.flores.uicomponentandroid.textSwitcher

import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.TextView
import android.widget.ViewSwitcher
import androidx.appcompat.app.AppCompatActivity
import com.flores.uicomponentandroid.R
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
            return@ViewFactory textView
        })

        textSwitcher_ts.inAnimation =
            AnimationUtils.loadAnimation(
                this, R.anim.text_switcher_fade_in_anim
            )
        textSwitcher_ts.outAnimation =
            AnimationUtils.loadAnimation(
                this, R.anim.text_switcher_fade_out_anim
            )
        textSwitcher_ts.setCurrentText(getString(R.string.textSwitcher_goodMorning))
        textSwitcher_btn_start.setOnClickListener {
            textSwitcher_ts.setText(getString(R.string.textSwitcher_goodNight))
        }
    }


}