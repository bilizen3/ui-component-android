package com.flores.uicomponentandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

/**
 * MainActivity
 *
 * @author Bill Flores - bilizen3@gmail.com
 * @since 03/10/2020
 */
class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        home_btn_textSwitcher.setOnClickListener {
            startActivity(Intent(this, TextSwitcherActivity::class.java))
        }
    }

}
