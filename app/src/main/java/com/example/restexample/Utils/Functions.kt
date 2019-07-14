package com.example.restexample.Utils

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.example.restexample.R
import kotlinx.android.synthetic.main.content_main.view.*

class Functions {
    public fun changeMainFragment (fragmentActivity: FragmentActivity, fragment: Fragment){
        fragmentActivity.supportFragmentManager.beginTransaction().replace(R.id.main_container, fragment).commit()
    }
}