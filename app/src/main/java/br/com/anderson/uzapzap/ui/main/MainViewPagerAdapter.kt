package br.com.anderson.uzapzap.ui.main

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import br.com.anderson.uzapzap.ui.base.BaseFragment

class MainViewPagerAdapter(fragemntManager: FragmentManager) : FragmentPagerAdapter(fragemntManager) {

    private val meusFragments = ArrayList<BaseFragment>()

    override fun getItem(position: Int): Fragment {
        return meusFragments[position]
    }

    override fun getCount(): Int {
        return meusFragments.size
    }

    fun addFragment(fragment: BaseFragment) {
        meusFragments.add(fragment)
    }
}